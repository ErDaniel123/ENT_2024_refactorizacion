package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {
	
	private List<String> productos = new ArrayList<>();
	
	/**
	 * Atributos estaticos que no se pueden modificar 
	 * Ayudan a saber como gestionar un producto(eliminarlo o añadirlo)
	 * 
	 */
	public static final int AÑADIR = 100;
	public static final int ELIMINAR = 200;

	/**
	 * 
	 * @param producto Producto String que se añade
	 * @param cual Se rellena con AÑADIR O ELIMINAR y ayuda a la operacion a saber que hacer
	 * @throws Exception Posibles excepciones que anules en programa 
	 */
	public void gestionarProducto(String producto, int cual) throws Exception {

		if (!productos.contains(producto) & cual == this.AÑADIR) {

			productos.add(producto);
			System.out.println("Producto '" + producto + "' agregado al almacén.");
		}

		else if (productos.contains(producto) & cual == this.ELIMINAR) {
			productos.remove(producto);
			System.out.println("Producto '" + producto + "' eliminado del almacén.");
		}

		else if (cual == this.AÑADIR) {
			throw new Exception("Imposible añadir");

		} else if (cual == this.ELIMINAR) {
			throw new Exception("Imposible borrar");
		}
		
		else throw new Exception("Operacion no existete");
	} 

}

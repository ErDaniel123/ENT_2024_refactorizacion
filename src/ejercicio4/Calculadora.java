package ejercicio4;

public class Calculadora {

	public static final int SUMAR = 100;
	public static final int RESTAR = 200;

	public int operacion(int a, int b, int cual) throws Exception {
		if (cual == this.SUMAR) {
			return a + b;
		}

		else if (cual== this.RESTAR) {
			return a - b;}
		
		else throw new Exception("No es ni suma ni resta");
	}

}

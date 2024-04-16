package ejercicio1;

public class Calculadora {
    public int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public int restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public int dividir(int a, int b) {
       int resultado=0;
    	if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return resultado;
        } else {
           resultado = a / b;
           return resultado;
        }
    
    }
   
    
}

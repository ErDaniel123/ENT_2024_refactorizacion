package ejercicio1;

public class Calculadora {
	public int sumar(int sumando, int restando) {
		int resultado = sumando + restando;
		return resultado;
	}

	public int restar(int minuendo, int sustraendo) {
		int resultado = minuendo - sustraendo;
		return resultado;
	}

	public int multiplicar(int factor1, int factor2) {
		int resultado = factor1 * factor2;
		return resultado;
	}

	public int dividir(int dividendo, int divisor) {
		int resultado = 0;
		if (divisor == 0) {
			// TODO DIVISION POR 0
			return resultado;
		} else {
			resultado = dividendo / divisor;
			return resultado;
		}

	}

}

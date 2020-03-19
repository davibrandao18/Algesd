package recursividade2;

public class Exercicio8 {
	/**
	 * Crie uma função recursiva para calcular o
	 * máximo divisor comum (MDC) entre dois números
	 * inteiros, usando o algoritmo de Euclides.
	 * 
	 * @param a
	 * @param b
	 * @return minimo multiplo comum de a e b
	 */
	public static int mdc(int a, int b) {
		if (a%b == 0) return b;
		else return mdc(b, a%b);
	}
}

package recursividade2;

public class Exercicio4 {
	
	/**
	 * O PI pode ser aproximado através de algumas expressões;
	 * quanto maior o valor de n, melhor é a aproximação.
	 * 
	 * @param n
	 * @return
	 */
	public static double pi(int n) {
		if (n==1) return 4.0;
		
		else if (n%2 == 0) return pi(n-1);
		else if (n%4 == 1) return pi(n-2) + 4.0/n;
		else return pi(n-2) - 4.0/n;
	}
}

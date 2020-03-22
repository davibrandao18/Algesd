package recursividade2;

public class Exercicio2 {
		
	public static void main (String args []) {
		System.out.println(exercicioDois(5));
	}
	
	public static int exercicioDois (int n) {
		
		if (n == 0) {return 0;}
		if (n%2 == 0) {
			n--;
			return n + exercicioDois(n-1);
		} else {
			return n + exercicioDois(n-1);
		}
	}

}

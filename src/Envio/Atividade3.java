package Envio;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		
		//---------------> Exerc�cios de recursividade 1
		
		System.out.println("Recursividade 1:\n");
		
		// 3) Crie um m�todo recursivo que procure um n�mero dentro de um vetor, a partir de um dado �ndice. 
		//    Se achar o mesmo, o m�todo retorna o �ndice onde ele se encontra, sen�o, retorna -1. (busca linear recursiva)
		
		System.out.println("-> Resposta exerc�cio 3: �ndice = "+procN(9, 99));
		
		//---------------> Exerc�cios de recursividade 2
		
		System.out.println("\nRecursividade 2:\n");
		
		// 2) Ache recursivamente a soma dos n�meros �mpares positivos at� n.
		
		System.out.println("-> Resposta exerc�cio 2: Soma dos �mpares = "+somaImpar(5));
		
		//6) Crie um procedimento recursivo que, dado um n�mero decimal, imprima 
		//   a representa��o bin�ria correspondente.
		
		repBinaria(12);
	}
	
	public static int procN (int i, int n) {
		int vet [] = {1, 2, 5, 8, 12, 14, 16, 27, 38, 99};
		
		if (i >= vet.length) {
			return -1;
		}
		if (n == vet[i]) {
			return i;
		} else { 
			return procN(i+1, n);
		}
	}
	
	public static int somaImpar (int n) {	
		if (n == 0) return 0;
		
		if (n%2 == 0) {
			n--;
			return n + somaImpar(n-1);
		} else {
			return n + somaImpar(n-1);
		}
	}
	
	public static void repBinaria (int n) {
		if (n > 0) {
			repBinaria(n/2);
			System.out.print(n%2);
		}
	}
}

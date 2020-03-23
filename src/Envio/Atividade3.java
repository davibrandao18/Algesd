package Envio;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		
		//---------------> Exercícios de recursividade 1
		
		System.out.println("Recursividade 1:\n");
		
		// 3) Crie um método recursivo que procure um número dentro de um vetor, a partir de um dado índice. 
		//    Se achar o mesmo, o método retorna o índice onde ele se encontra, senão, retorna -1. (busca linear recursiva)
		
		System.out.println("-> Resposta exercício 3: Índice = "+procN(1, 27));
		
		//---------------> Exercícios de recursividade 2
		
		System.out.println("\nRecursividade 2:\n");
		
		// 2) Ache recursivamente a soma dos números ímpares positivos até n.
		
		System.out.println("-> Resposta exercício 2: Soma dos ímpares = "+somaImpar(5));
		
		//6) Crie um procedimento recursivo que, dado um número decimal, imprima 
		//   a representação binária correspondente.
		
		System.out.println("-> "+);
	}
	
	public static int procN (int i, int n) {
		int vet [] = {1, 2, 5, 8, 12, 14, 16, 27, 38, 99};
		
		if (i > vet.length) {
			return -1;
		}
		if (n == vet[i]) {
			return i;
		} else { 
			return procN(i+1, n);
		}
	}
	
	public static int somaImpar (int n) {	
		if (n == 0) {return 0;}
		if (n%2 == 0) {
			n--;
			return n + somaImpar(n-1);
		} else {
			return n + somaImpar(n-1);
		}
	}
	
}

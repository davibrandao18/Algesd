package Envio;

public class Atividade3 {
	
	public static void main(String[] args) {

		// Exercicios de recursividade 1
		System.out.println("Recursividade 1:\n");
		
		/*
		 * 3) Crie um metodo recursivo que procure um numero dentro de um vetor,
		 *    a partir de um dado indice. Se achar o mesmo, o metodo retorna o
		 *    indice onde ele se encontra, senao, retorna -1. (busca linear recursiva)
		 */
		System.out.println("-> Resposta exercicio 3: indice = "+procN(1, 27));
		
		/*
		 * 4) Crie um método recursivo que implemente a busca binaria recursiva.
		 */
		int numeros[] = {0, 1, 4, 7, 9, 15, 17};
		System.out.println("-> Resposta exercicio 4: " +buscaBinaria(numeros, 17, 0, numeros.length));
		
		/*
		 * 5) Crie um metodo recursivo que retorne o maior elemento de um vetor.
		 */
		System.out.println("-> Resposta exercicio 5: " +retornaMaior(numeros.length, numeros));
		
		
		
		// Exercicios de recursividade 2
		System.out.println("\nRecursividade 2:\n");
		
		/*
		 * 2) Ache recursivamente a soma dos numeros impares positivos ate n.
		 */
		System.out.println("-> Resposta exercicio 2: Soma dos impares = "+somaImpar(5));
		
		//6) Crie um procedimento recursivo que, dado um numero decimal, imprima 
		//   a representacao binaria correspondente.
		System.out.print("-> Resposta exercicio 6: Representaco binaria: ");

		repBinaria(12);
	}
	
	public static int procN (int i, int n) {
		int vet [] = {1, 2, 5, 8, 12, 14, 16, 27, 38, 99};
		
		if (i >= vet.length) return -1;
		
		if (n == vet[i]) return i;
		else return procN(i+1, n);
	}
	
	public static int buscaBinaria(int[] x, int proc, int inicio, int fim) {
		if(inicio>fim) return -1;
		 
		int meio=(inicio+fim)/2;
		 
		if(x[meio] < proc) return buscaBinaria(x,proc,meio+1,fim);
		else if(x[meio] > proc) return buscaBinaria(x,proc,inicio,fim);
		else return meio;
	}
	
	public static int retornaMaior (int tamanhoArray, int array[]) {

		if (tamanhoArray == 1) return array[0];
		
		else {
	      int x = retornaMaior(tamanhoArray -1, array);
	      
	      if (x > array[tamanhoArray-1]) return x;
	      
	      else return array[tamanhoArray-1];
		}
	}
	
	public static int somaImpar (int n) {	
		if (n == 0) return 0;
		
		if (n%2 == 0) {
			n--;
			return n + somaImpar(n-1);
		} else return n + somaImpar(n-1);
	}
	
	public static void repBinaria (int n) {
		if (n > 0) {
			repBinaria(n/2);
			System.out.print(n%2);
		}
	}
}

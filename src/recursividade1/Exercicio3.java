package recursividade1;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3) Crie um método recursivo que procure um número dentro de um vetor, a partir de um dado índice. 
		//    Se achar o mesmo, o método retorna o índice onde ele se encontra, senão, retorna -1. (busca linear recursiva)
		
		System.out.println(procN(10, 27));
		
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
}
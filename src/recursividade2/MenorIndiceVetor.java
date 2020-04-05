package recursividade2;

public class MenorIndiceVetor {

	public static void main(String[] args) {
		//Indices ->  0  1  2  3  4    5   6
		int vet [] = {0, 3, 4, 7, -90, -1, -133};
		int indice = 0;
		int menor = vet[0];
		
		System.out.println("O menor valor do vetor é "+MenorValorVetor(vet, indice, menor));

	}
	
	public static int MenorValorVetor(int vet[], int indice, int menor) {
		if (indice < vet.length) {
			if (vet [indice] < menor) {
				menor = vet [indice];
				return MenorValorVetor(vet, ++indice, menor);
			} else {
				return MenorValorVetor(vet, ++indice, menor);
			}
		} else {
				return menor;
		}
	}

}

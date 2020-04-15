package ordenacao5;

import java.util.Arrays;

public class Decrescente {
	
	 public static void main(String args[])
     {
        String saida1="\nMergeSort\n";
        
        for(int tam=10; tam <= 20; tam=tam+5)
        {
           int vet1[] = new int [tam]; 
       
            //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = (int) (Math.random() * 1000);
           
           long tempoAntes = System.currentTimeMillis();
           System.out.println(Arrays.toString(vet1));
           quickSortDecrescente(vet1);
           long tempoDepois = System.currentTimeMillis();
           System.out.println(Arrays.toString(vet1));
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";


        }

        System.out.println(saida1);
     }
	
	public static void quickSortDecrescente(int vet[]) {
		quickSortDecrescente(vet, 0, vet.length-1); 
	}

	private static void quickSortDecrescente(int vet[], int esquerda, int direita) {
		int indice = particao(vet, esquerda, direita); 
		if (esquerda < indice - 1) 
		quickSortDecrescente(vet, esquerda, indice - 1); 
		if (indice < direita - 1) 
		quickSortDecrescente(vet, indice + 1, direita); 
	 }    
	
	 private static int particao(int vet[], int esquerda, int direita) {
		 int i = esquerda, j = direita, aux; 
		 int pivo = vet[esquerda];     
		 while (i < j) { 
			 while (vet[j] < pivo){
				 j--;
			 }
			 if(i >= j){
				 return i;
			 }
			 aux = vet[i]; 
			 vet[i] = vet[j]; 
			 vet[j] = aux;
			 i++;
			 while (vet[i] > pivo){
				 i++;
			 }
			 aux = vet[i]; 
			 vet[i] = vet[j]; 
			 vet[j] = aux;
			 j--;
		 } 
		 return i; 
	 }
}

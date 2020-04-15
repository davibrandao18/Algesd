package ordenacao4;

import java.util.Arrays;

import ordenacao4.MergeSort;

public class Desempenho {
	
	 public static void main(String args[])
     {
        String saida1="\nMergeSort\n";
        String saida2="\nArrays.sort()\n";
        long tempoAntes, tempoDepois;
        
        for(int tam=100000; tam <= 1000000; tam=tam+100000)
        {
           int vet1[] = new int [tam];
       
            //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = (int) (Math.random() * 1000);
           
           tempoAntes = System.currentTimeMillis();
           MergeSort.mergeSort(vet1);
           tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
           
           tempoAntes = System.currentTimeMillis();
           Arrays.sort(vet1);
           tempoDepois = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

        }

        System.out.println(saida1 +saida2);
     }
	
}

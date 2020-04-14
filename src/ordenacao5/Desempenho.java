package ordenacao5;

import java.util.Arrays;

import ordenacao4.MergeSort;
import ordenacao5.Quiksort;

public class Desempenho {
	
	 public static void main(String args[])
     {
        String saida1="\nMergeSort\n";
        String saida2="\nQuikSort\n";
        String saida3="\nArraysSort\n";
        
        for(int tam=100000; tam <= 1000000; tam=tam+100000)
        {
           int vet1[] = new int [tam];  
           int vet2[] = new int [tam];
           int vet3[] = new int [tam];
       
            //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = vet2[i] = vet3[i]= (int) (Math.random() * 1000);
           
           long tempoAntes = System.currentTimeMillis();
           MergeSort.mergeSort(vet1);
           long tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
           
           long tempoAntes2 = System.currentTimeMillis();
           Quiksort.quickSort(vet2);
           long tempoDepois2 = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois2-tempoAntes2) + " ms\n";
           
           long tempoAntes3 = System.currentTimeMillis();
           Arrays.sort(vet3);
           long tempoDepois3 = System.currentTimeMillis();
           saida3+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois3-tempoAntes3) + " ms\n";


        }

        System.out.println(saida1);
        System.out.println(saida2);
        System.out.println(saida3);
     }
	
}

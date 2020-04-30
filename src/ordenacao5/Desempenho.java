package ordenacao5;

import java.util.Arrays;

import ordenacao4.MergeSort;
import ordenacao5.Quiksort;

public class Desempenho {
	
	 public static void main(String args[])
     {
        String saida1="\nMergeSort\n";
        String saida2="\nMergeOtimizado\n";
        String saida3="\nQuickSort\n";
        String saida4="\nArraysSort\n";
        long tempoAntes, tempoDepois;
        
        for(int tam=1000; tam <= 100000; tam=tam+10000)
        {
           int vet[] = new int [tam];
       
           //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet[i] = (int) (Math.random() * 1000);
           
           tempoAntes = System.currentTimeMillis();
           MergeSort.mergeSort(vet);
           tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
           
           tempoAntes = System.currentTimeMillis();
           Fodase.mergeSort(vet);
           tempoDepois = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
           
           tempoAntes = System.currentTimeMillis();
           Quiksort.quickSort(vet);
           tempoDepois = System.currentTimeMillis();
           saida3+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
           
           tempoAntes = System.currentTimeMillis();
           Arrays.sort(vet);
           tempoDepois = System.currentTimeMillis();
           saida4+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

        }

        System.out.println(saida1 +saida2 +saida3 +saida4);
     }
	
}

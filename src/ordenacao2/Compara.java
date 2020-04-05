package ordenacao2;

import ordenacao1.Bolha2;
import ordenacao2.Selecao;

public class Compara {
	 public static void main(String args[])
     {
        String saida1="\nMetodo da Bolha\n";
        String saida2="\nMetodo da Seleção\n";
              
        for(int tam=5000; tam <= 40000; tam=tam+5000)
        {
           int vet1[] = new int [tam];  
           int vet2[] = new int [tam]; 
       
            //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = vet2[i] = (int) (Math.random() * 1000);
           
           long tempoAntes = System.currentTimeMillis();
           Bolha2.bolha2Cresc(vet1);
           long tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

           tempoAntes = System.currentTimeMillis();
           Selecao.selecao(vet2);
           tempoDepois = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

        }

        System.out.println(saida1);
        System.out.println(saida2);
     }
}

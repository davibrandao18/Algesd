package ordenacao3;

import ordenacao3.Insercao;

public class Compara {
	 public static void main(String args[])
     {

        String saida1="\nMetodo da Inserção\n";
              
        for(int tam=5000; tam <= 40000; tam=tam+5000)
        {
           int vet[] = new int [tam];  
       
            //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet[i] = (int) (Math.random() * 1000);
           
           long tempoAntes = System.currentTimeMillis();
           Insercao.insercao(vet);
           long tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";


        }

        System.out.println(saida1);
     }
}

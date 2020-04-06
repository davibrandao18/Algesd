package envioOrdenacaoMaicon;
import java.util.Arrays;

/**
 * 
 * @author maiconspa
 *
 */
public class InsertSort {

	public static void insercao(int vet[]) {
       for(int i=1; i<vet.length; i++)
       {
          int aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j]>aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
       
       // modificacao para exibir o vetor
       System.out.println("Vetor organizado: " +Arrays.toString(vet));
    }
    
	public static void insercaoDecresc(int vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          int aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j]<aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
       
       System.out.println("Vetor organizado: " +Arrays.toString(vet));
    }
	
	public static void compara3() {
		String saida1="\nMetodo da Bolha\n";
        String saida2="\nMetodo da Seleção\n";
        String saida3="\nMetodo da Inserção\n";
        long tempoAntes, tempoDepois;
              
        for(int tam=5000; tam <= 40000; tam=tam+5000)
        {
           int vet1[] = new int [tam];  
           int vet2[] = new int [tam]; 
       
            //Preenchendo os vetores com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = vet2[i] = (int) (Math.random() * 1000);
           
           tempoAntes = System.currentTimeMillis();
           BubbleSort.bolha3(vet1);
           tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

           tempoAntes = System.currentTimeMillis();
           SelectionSort.selecao(vet2);
           tempoDepois = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
           
           tempoAntes = System.currentTimeMillis();
           insercao(vet2);
           tempoDepois = System.currentTimeMillis();
           saida3+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";
        }
        System.out.println(saida1 + saida2 + saida3);
	}
    
	public static void insertCont(int vet[]) {
    	int contComp=0;
    	int contAtrib=0;
    	
       for(int i=1; i<vet.length; i++)
       {
          int aux = vet[i]; contAtrib++;
          int j = i-1;
          while(j>=0 && vet[j]>aux)
          {
        	 contComp++;
             vet[j+1] = vet[j]; contAtrib++;
             j--;
          }
          vet[j+1] = aux; contAtrib++;
       }
       

       // modificacao para exibir o vetor:
       System.out.println("6) comparacoes feitas: " +contComp +
      		 "\n atribuições feitas: " +contAtrib);
	}
    
    public static void executaInsert() {
    	int desordenado[] = {3, 7, 2, 9, 6, 4, 2};
    	
    	int[] vet10 = new int[10];
    	int[] vet50 = new int[50];
    	int[] vet100 = new int[100];
    	int[] vet150 = new int[150];
    	int[] vet200 = new int[200];
    	
    	//Preenchendo os vetores com elementos aleatorios
        for(int i=0; i<10; i++)
           vet10[i] = (int) (Math.random() * 10);
        
        for(int i=0; i<50; i++)
            vet50[i] = (int) (Math.random() * 10);
     	
        for(int i=0; i<100; i++)
           vet100[i] = (int) (Math.random() * 100);
        
        for(int i=0; i<150; i++)
           vet150[i] = (int) (Math.random() * 100);

        for(int i=0; i<200; i++)
           vet200[i] = (int) (Math.random() * 100);
    	
    	
    	insercao(desordenado);
    	insercaoDecresc(desordenado);
    	compara3();
    	
    	insertCont(vet10);
    	insertCont(vet50);
    	insertCont(vet100);
    	insertCont(vet150);
    	insertCont(vet200);
    }
}

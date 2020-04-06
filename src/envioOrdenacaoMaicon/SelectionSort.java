package envioOrdenacaoMaicon;
import java.util.Arrays;

/**
 * Ordenacao 2
 * @author maiconspa
 *
 */
public class SelectionSort {
	
	/**
	 * 2) Teste o algoritmo
	 * @param vet
	 */
	public static void selecao(int vet[]) {
       for(int i=0; i<vet.length-1; i++) {
          int indMenor = i;
          
          for(int j=i+1; j<vet.length; j++)
             if(vet[j] < vet[indMenor]) indMenor = j;

          int aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
       
       // modificacao para exibir o vetor:
       System.out.println("2): " + Arrays.toString(vet));
    }
	
	/**
	 * 3) Altere o algoritmo acima para executar ordenação em ordem decrescente.
	 * @param vet
	 */
	public static void selecaoDescrescente(int vet[]) {
       for(int i=0; i<vet.length-1; i++) {
          int indMaior = i;
          
          for(int j=i+1; j<vet.length; j++)
             if(vet[j] > vet[indMaior]) indMaior = j;

          int aux = vet[i];
          vet[i] = vet[indMaior];
          vet[indMaior] = aux;
       }
       
       // Exibindo o vetor:
       System.out.println("3) Ordenação decrescente: " + Arrays.toString(vet));
    }
    
    
	/*
	 *  4) Reescreva o método acima dividindo-o em dois: um que descubra o índice do menor elemento de um vetor,
	 *  a partir de um dado índice, e um outro que faça uso do primeiro para efetuar
	 *  as devidas trocas e ordenar o vetor pela técnica da seleção.
	 */
	public static int indiceMenorElemento(int vet[], int inicio) {
		int indMenor = inicio;
		
		for(int j=inicio+1; j<vet.length; j++)
           if(vet[j] < vet[indMenor]) indMenor = j;

		return indMenor;
	}
	
	public static void selecao2(int vet[]) {
		for(int i=0; i<vet.length-1; i++) {
	          int indMenor = indiceMenorElemento(vet, i);
	          int aux = vet[i];
	          vet[i] = vet[indMenor];
	          vet[indMenor] = aux;
        }
		System.out.println("4) Ordenado pela selecao 2: " + Arrays.toString(vet));
	}
	
	
	/**
	 * 5)
	 */
	public static void comparaBolhaSelecao() {
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
           BubbleSort.bolha2(vet1);
           long tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

           tempoAntes = System.currentTimeMillis();
           selecao(vet2);
           tempoDepois = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";

        }

        System.out.println(saida1);
        System.out.println(saida2);
	}
    
	
	
	/*
	 * 6)
	 */
    public static void selecaoCont(int vet[]) {
    	int contComp=0;
    	int contAtrib=0;
    	
    	for(int i=0; i<vet.length-1; i++) {
            int indMenor = i;
            
            for(int j=i+1; j<vet.length; j++)
               if(vet[j] < vet[indMenor]) {
            	   indMenor = j;
            	   contComp++;
            	   contAtrib++;
               } else {
            	   contComp++;
               }

            int aux = vet[i]; contAtrib++;
            vet[i] = vet[indMenor]; contAtrib++;
            vet[indMenor] = aux; contAtrib++;
         }
         
         // modificacao para exibir o vetor:
         System.out.println("6) comparacoes feitas: " +contComp +
        		 "\n atribuições feitas: " +contAtrib);
    }
    
    public static void executaSelection() {
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
    	
    	selecao(desordenado);
    	
    	System.out.println(); // quebra de linha
    	selecaoDescrescente(desordenado);

    	System.out.println(); // quebra de linha
    	selecao2(desordenado);
    	
    	System.out.println(); // quebra de linha
    	comparaBolhaSelecao();

    	System.out.println(); // quebra de linha
    	selecaoCont(vet10);
    	selecaoCont(vet50);
    	selecaoCont(vet100);
    	selecaoCont(vet150);
    	selecaoCont(vet200);
    }
}

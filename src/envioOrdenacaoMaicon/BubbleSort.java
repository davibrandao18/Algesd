package envioOrdenacaoMaicon;
import java.util.Arrays;

/**
 * Ordenacao 1
 * @author maiconspa
 *
 */
public class BubbleSort {

	public static void bolha1(int vet[]) {
       for(int i=1; i<= vet.length-1; i++)
          for(int j=0; j<vet.length-1; j++)
             if(vet[j]>vet[j+1]) {
                int aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
             }
    }

    public static void bolha2(int vet[]) {
       for(int i=1; i<= vet.length-1; i++)
          for(int j=0; j<vet.length-i; j++)
             if(vet[j]>vet[j+1]) {
                int aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
             }
    }

    public static void bolha3(int vet[]) {
	  int aux;
	  boolean troca;
	  int j=vet.length-1;
	
	  do {
		  troca=false;
		  for (int i=0; i<j; i++)
			  if (vet[i]>vet[i+1]) {
				  aux=vet[i];
				  vet[i]=vet[i+1];
				  vet[i+1]=aux;
				  troca=true;
			  }
		  
	     j--;
	  }while (troca);
    }
    
    
    /**
     * 1) Observe a figura animada abaixo que simula o método de ordenação por seleção.
     * 2) Teste os algoritmos acima.
     */
    public static void testaExemplos(int vet[]) {
    	System.out.println("testando bolha1..."); bolha1(vet);
    	System.out.println("testando bolha2..."); bolha2(vet);
    	System.out.println("testando bolha3..."); bolha3(vet);
    }
    
    
    /**
     * 3) Altere o bolha2 para executar ordenação em ordem decrescente.
     */
    public static void bolha2Decrescente(int vet[]) {
    	System.out.println("Vetor desorganizado: " + Arrays.toString(vet));
    	
    	for(int i=1; i<= vet.length-1; i++)
            for(int j=0; j<vet.length-i; j++)
               if(vet[j]<vet[j+1]) {
                  int aux = vet[j];
                  vet[j] = vet[j+1];
                  vet[j+1] = aux;
               }
    	
    	System.out.println("Organizado em forma decrescente: " + Arrays.toString(vet));
    }
    
    
    /**
     * 4) Crie um método que descubra se um vetor está ordenado em ordem crescente ou não.
     * @param vet
     * @return boolean
     */
    public static boolean ordenado(int vet[]) {
    	// variável contadora
    	int cont = 1;
    		
    	for (int i = 1; i<vet.length; i++)
    		
    		if (vet[i-1] < vet[i]) cont++;// se o anterior for maior do que proximo, significa que é crescente
    		
    		else return false; // Senão, retorna falso
    	
    	// Se a variavel contadora for igual ao tamanho do vetor, significa ele está ordenado de forma crescente.
    	return (cont == vet.length);
    }
    
    
    /**
     * 5) Use o trecho de código abaixo para avaliar o desempenho do método de ordenação da bolha2.
	 * Use uma planilha para traçar um gráfico de tempo em função do tamanho do vetor (use o chamado gráfico de dispersão).
	 * Que curva é a esboçada?
     */
    public static void performanceBolha2() {
    	String saida1="\nMetodo da Bolha\n";
        
        for(int tam=5000; tam <= 40000; tam=tam+5000) {
           int vet1[] = new int [tam];            
           
           //Preenchendo o vetor com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = (int) (Math.random() * 1000);
               
           long tempoAntes = System.currentTimeMillis();
           bolha2(vet1);
           long tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";  
        }  

        System.out.println(saida1);
        System.out.println("O gráfico esboçado tem o formato de uma parábola (enviado em anexo no Google Classroom)");
    }
    
    
    /**
     * 6) Use o que você aprendeu no exercício 5 para comparar o desempenho das três versões do método bolha.
     */
    public static void performanceBolhas() {
    	String saida1="\nMetodo da Bolha1\n";
    	String saida2="\nMetodo da Bolha2\n";
    	String saida3="\nMetodo da Bolha3\n";
    	
        for(int tam=5000; tam <= 40000; tam=tam+5000) {
           int vet1[] = new int [tam];
           
           //Preenchendo o vetor com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet1[i] = (int) (Math.random() * 1000);
           
           long tempoAntes1 = System.currentTimeMillis();
           bolha1(vet1);
           long tempoDepois1 = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois1-tempoAntes1) + " ms\n";
           
           long tempoAntes2 = System.currentTimeMillis();
           bolha2(vet1);
           long tempoDepois2 = System.currentTimeMillis();
           saida2+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois2-tempoAntes2) + " ms\n";
           
           long tempoAntes3 = System.currentTimeMillis();
           bolha3(vet1);
           long tempoDepois3 = System.currentTimeMillis();
           saida3+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois3-tempoAntes3) + " ms\n";
        }
        
        System.out.println(saida1 +"\n" +saida2 +"\n" +saida3);
    }
    
    
    /**
     * Método para executar todos os exercicios
     */
    public static void executaBubble() {
    	int desordenado[] = {3, 7, 2, 9, 6, 4, 2};
    	int crescente[] = {1, 3, 7, 8, 10, 14};
    	
    	testaExemplos(desordenado);
    	bolha2Decrescente(desordenado);
    	System.out.println("\n\nO vetor está ordenado de forma crescente? " +ordenado(crescente));
    	performanceBolha2();
    	performanceBolhas();
    }
}

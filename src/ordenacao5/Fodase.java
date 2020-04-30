package ordenacao5;

public class Fodase {
	
		public static void mergeSort(int vet[])
	    {
	       int vetaux[] = new int[vet.length];
	       mergeSort(vet, 0, vet.length-1, vetaux);  
	    }
	    
	    public  static void mergeSort(int vet[], int inicio, int fim, int vetaux[])
	    {
	    	if (vet.length <= 20 && vet.length >= 8) {
	    		
	    		insercao(vet);
	    		
	    	} else if(fim-inicio >= 1)   // 2 ou mais elementos
	       {
	          int meio = (inicio + fim)/2;
	          mergeSort(vet, inicio, meio, vetaux);
	          mergeSort(vet, meio+1, fim, vetaux);
	          mescla(vet, inicio, meio, fim, vetaux);
	       }

	       // não há nada que fazer com menos de 2 elementos
	     }
	  
	    public  static void mescla(int vet[], int inicio, int meio, int fim, int vetaux[])
	    {
	       int i=inicio;
	       int j=meio+1;
	       int k=inicio;
	  
	       while(k <= fim)   //organizando em vetaux
	       {
	          if(i <= meio && j <= fim)
	          {
	             if(vet[i] < vet[j])
	             {
	                vetaux[k] = vet[i];
	                i++; k++;
	             }
	             else
	             {
	                vetaux[k] = vet[j];
	                j++; k++;
	             }
	          }
	          else if(i > meio)
	          {
	             vetaux[k] = vet[j];
	             j++; k++;
	          }
	          else
	          {
	             vetaux[k] = vet[i];
	             i++; k++;
	          }
	       }
	     
	       for(i=inicio; i <= fim; i++)  //copiando de volta de vetaux para vet
	          vet[i] = vetaux[i];
	    }
	    
	    public static void insercao(int vet[])
	    {
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
	    }
	
}

package ordenacao3;

import java.util.Arrays;

public class Insercao {

	public static void main(String[] args) {
		String vet[] = {"Daniel", "Marcos", "Ana", "Bia"};
		System.out.println("Antes: " + Arrays.toString(vet));
		insercaoDebug(vet);
		System.out.println("Depois: " + Arrays.toString(vet));
		int vet2[] = {0,-5,63,48,266,1};
		insercao(vet2);
		System.out.println("Crescente: " + Arrays.toString(vet2));
		insercaoDecresc(vet2);
		System.out.println("Decrescente: " + Arrays.toString(vet2));
		
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
    }
	
	public static void insercaoString(String vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          String aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j].compareTo(aux) > 0)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
          
       }
    }
	
	public static void insercaoDebug(String vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          String aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j].compareTo(aux) > 0)
          {
             vet[j+1] = vet[j];
             System.out.println("DEBUG: " + Arrays.toString(vet));
             j--;
          }
          vet[j+1] = aux;
       }
    }

}

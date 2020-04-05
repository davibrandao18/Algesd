package ordenacao1;
import java.util.*;

public class Bolha2 {
	
	public static void main(String[] args) {
		String vet[] = {"Daniel", "Marcos", "Ana", "Bia"};
		int vet2[] = {0,-5,63,48,266,1};
		bolha2Debug(vet);
		bolha2Cresc(vet2);
		String a = ordenado(vet2)? "Está em ordem crescente" : "Não está em oredem crescente";
		System.out.println(a);
		bolha2Decresc(vet2);
	}
	
	
	//Descobrindo se está ordenado em ordem decrescente ou crecente
	public static boolean ordenado(int vet[]) {
		System.out.println("\nEste verifica se o vetor está em ordem Crescente ->\nVetor Original: " + Arrays.toString(vet));
		for (int i=0; i<vet.length-1; i++) {
			if (vet[i] > vet [i+1]) {
				return false;
			}
		}
		return true;
	}
	
	//Versao decrescente
	
	public static void bolha2Decresc(int vet[]) {
		System.out.println("\nEste é o Bolha 2  em ordem Decrescente ->\nAntes: " + Arrays.toString(vet));
		for (int i=1; i < vet.length-1; i++){
			for (int j=0 ; j<vet.length-i; j++){
				if (vet[j] < vet[j+1]){
					int aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
				 //System.out.println("\tDEBUG" + i + ": " + Arrays.toString(vet));
			}
		}
		System.out.println("Depois: " + Arrays.toString(vet));
	}
	
	//Versao crescente
	
	public static void bolha2Cresc(int vet[]) {
		//System.out.println("\nEste é o Bolha 2  em ordem Crescente de Inteiros ->\nAntes: " + Arrays.toString(vet));
		 for(int i=1; i<= vet.length-1; i++)
		    for(int j=0; j<vet.length-i; j++)
		       if(vet[j]>vet[j+1])
		       {
		          int aux = vet[j];
		          vet[j] = vet[j+1];
		          vet[j+1] = aux;
		       }
		 //System.out.println("Depois: " + Arrays.toString(vet));
	}
	
	//Versao com String
		
	public static void bolha2(String vet[])
      {
		System.out.println("\nEste é o Bolha 2  em ordem Crescente de Strings ->\nAntes: " + Arrays.toString(vet));
         for(int i=1; i<= vet.length-1; i++)
            for(int j=0; j<vet.length-i; j++)
               if(vet[j].compareTo(vet[j+1]) > 0)
               {
                  String aux = vet[j];
                  vet[j] = vet[j+1];
                  vet[j+1] = aux;
               }
         System.out.println("Depois: " + Arrays.toString(vet));
      }
	
	//Versão DEBUG com String:
			
	public static void bolha2Debug(String vet[])
      {
		System.out.println("\nEste é o Bolha 2  em ordem Crescente de Strings com Debug ->\nAntes: " + Arrays.toString(vet));
         for(int i=1; i<= vet.length-1; i++)
         {   for(int j=0; j<vet.length-i; j++)
               if(vet[j].compareTo(vet[j+1]) > 0)
               {
                  String aux = vet[j];
                  vet[j] = vet[j+1];
                  vet[j+1] = aux;
               }
             System.out.println("\tDEBUG: " + Arrays.toString(vet));
         }
         System.out.println("Depois: " + Arrays.toString(vet));
      }

	}
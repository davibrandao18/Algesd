package ordenacao1;

import java.util.Arrays;

public class Bolha3 {

	public static void main(String[] args) {
		int vet[] = {0,-5,6,48,266,1};
		System.out.println("Antes: " + Arrays.toString(vet));
		bolha3(vet);
		System.out.println("Depois: " + Arrays.toString(vet));

	}
	
	 public static void bolha3(int vet[])
     {
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

}

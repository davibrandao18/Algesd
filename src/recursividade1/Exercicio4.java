package recursividade1;

public class Exercicio4 {
	
	public static void main(String [] args) {
		
		int vet[] = {0,1,2,3,4,5,6,7,8,10,12};
		int proc = 15;
		int inicio = 0;
		int fim = vet.length-1;
		
		if (buscaBinaria(vet, proc, inicio, fim) != -1) { System.out.println("Índice = "+buscaBinaria(vet, proc, inicio, fim));
		} else {
			System.out.println("O valor procurado "+proc+" não existe !");
		}
	}
	
	//Crie um método recursivo que implemente a busca binÃ¡ria recursiva.
	/*public static int exercicio4(int[] x, int proc, int inicio, int fim) {
=======
	public static int buscaBinaria(int[] x, int proc, int inicio, int fim) {
>>>>>>> 154ca2289c8153e9c5f1e991955e08b6834e7297
		if(inicio>fim) return -1;
		 
		int meio=(inicio+fim)/2;
		 
		if(x[meio] < proc) return buscaBinaria(x,proc,meio+1,fim);
		else if(x[meio] > proc) return buscaBinaria(x,proc,inicio,fim);
		else return meio;
	}*/
	
	
	
	public static int buscaBinaria(int vet[],int proc, int inicio, int fim) {
		if(inicio > fim) { 
			return -1; //Quando não existe !
		} else { 
			int meio = (inicio+fim)/2;
			if (vet[meio] == proc) {return meio;
			} else if (vet[meio]>proc) {return buscaBinaria(vet,proc,inicio, fim=meio-1);
			} else {return buscaBinaria(vet,proc,inicio=meio+1, fim);}
		}
	}
	
	
	
	
}

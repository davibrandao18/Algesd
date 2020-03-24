package recursividade1;

public class Exercicio4 {
	public static int buscaBinaria(int[] x, int proc, int inicio, int fim) {
		if(inicio>fim) return -1;
		 
		int meio=(inicio+fim)/2;
		 
		if(x[meio] < proc) return buscaBinaria(x,proc,meio+1,fim);
		else if(x[meio] > proc) return buscaBinaria(x,proc,inicio,fim);
		else return meio;
	}
}

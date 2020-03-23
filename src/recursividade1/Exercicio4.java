package recursividade1;

public class Exercicio4 {
	//Crie um método recursivo que implemente a busca binária recursiva.
	public static int exercicio4(int[] x, int proc, int inicio, int fim) {
		if(inicio>fim) return -1;
		 
		int meio=(inicio+fim)/2;
		 
		if(x[meio] < proc) return exercicio4(x,proc,meio+1,fim);
		else if(x[meio] > proc) return exercicio4(x,proc,inicio,fim);
		else return meio;
	}
}

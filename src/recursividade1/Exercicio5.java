package recursividade1;

public class Exercicio5 {
<<<<<<< HEAD
	//htpp://dontpad.com/blocodenotas3
	public int maiorVet(int vet[], int inicio) {
		if (vet.length == 1) {;
			return vet[0];
		} else if (inicio > vet.length) {
			/*TODO*/return inicio;
		
		}
		return inicio;
	}
	
=======
	public static int retornaMaior (int tamanhoArray, int array[]) {

		if (tamanhoArray == 1) return array[0];
		
		else {
	      int x = retornaMaior(tamanhoArray -1, array);
	      
	      if (x > array[tamanhoArray-1]) return x;
	      
	      else return array[tamanhoArray-1];
		}
	}
>>>>>>> 154ca2289c8153e9c5f1e991955e08b6834e7297
}

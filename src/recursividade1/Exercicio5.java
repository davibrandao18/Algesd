package recursividade1;

public class Exercicio5 {
	public static int retornaMaior (int tamanhoArray, int array[]) {

		if (tamanhoArray == 1) return array[0];
		
		else {
	      int x = retornaMaior(tamanhoArray -1, array);
	      
	      if (x > array[tamanhoArray-1]) return x;
	      
	      else return array[tamanhoArray-1];
		}
	}
}

package revisaoD1;

public class Recursividade {
	
	public static void main(String [] args) {
		int a = 5, b = 1;

		System.out.println(""+alg(a,b));
		
        int vet[] = {2,4,6,8,10};

        System.out.println(soma(vet, 0));
        
        int w = (8+9)/2;
        System.out.println("Media: "+w+" Resp func "+mediaRa(w));
	}
	
	public static int alg(int a, int b) {
		if (a == 0) return b;
		else return alg(a-1, b+1)+a/b;
	}
	
	public static int soma(int vet[], int inicio) {
		if (inicio >= vet.length)return 0;
		else return soma(vet, inicio+1) + vet[inicio];
	}
	
   /**
    * Simulação mergeSort
	* [5,8,3,1,7,2,6,4]
	* [5,8,3,1]   [7,2,6,4]
	* [5,8]  [3,1]  [7,2]   [6,4]
	* [5]  [8]  [3]  [1]  [7]  [2]  [6]  [4]
	* [5,8]  [1,3]  [2,7]  [4,6]
	* [1,3,5,8]  [2,4,6,7]
	* [1,2,3,4,5,6,7,8]
	*/
	
	 public static int mediaRa(int a) {
		 if (a ==0)return 1;
		 else return (1 + 2*mediaRa(a-1));
	 }
	 
	/**
	 * Simulação BubbleSort
	 * [5,8,3,1,7]
	 * [5,3,8,1,7]
	 * [5,3,1,8,7]
	 * [5,3,1,7,8]
	 * 
	 * [3,5,1,7,8]
	 * [3,1,5,7,8]
	 * [3,1,5,7,8]
	 * 
	 * [1,3,5,7,8]
	 * [1,3,5,7,8]
	 * 
	 * [1,3,5,7,8]
	 */
}

package recursividade2;

public class Exercicio5 {
	
/**	
*	5) Crie uma função recursiva que, dados dois números inteiros x e n,
*	calcule o valor de x elevado a n.Qual é a base, ou seja, o caso mais simples? 
*	Para o caso geral, lembre-se que, por exemplo, 2 elevado a 10 = 2 * 2 elevado a 9 ....
**/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x  = 4 , n = 2;
		System.out.println(potencia(x,n));
	}
	
	public static int potencia(int x, int n) {
		if(n == 0) {
			return 1;
		} else {
		return potencia(x, n-1) * x;
		}
	}
	
}

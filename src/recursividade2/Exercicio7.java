package recursividade2;

public class Exercicio7 {
	
	/**	7) Crie um procedimento recursivo que, dado um número binário, imprima a representação decimal correspondente. Por exemplo:
    *	1100 em binário corresponde a 12 em decimal, porque 0*1 + 0*2 + 1*4 + 1*8 = 12.
	*	Qual é a base? E o caso geral?
	**/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binario ="110";
		int contador = binario.length() -1;
		int potencia = 0;
		int decimal = 0;
		
		System.out.println("O número binário "+binario+" em decimal é = "+
		binarioDecimal(binario, contador, potencia, decimal));
		
		
	}
	
	public static int binarioDecimal(String binario, int contador, int potencia, int decimal) {
		if (contador >= 0) {
			decimal += Math.pow(2, potencia) * Character.getNumericValue(binario.charAt(contador));
			return binarioDecimal(binario, contador-1, potencia+1,decimal);
		}
		return decimal;
	}
}

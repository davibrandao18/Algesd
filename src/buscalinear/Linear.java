package buscalinear;

/**
 * Classe para utilizacao de algoritmos de busca linear/ sequencial
 */
public class Linear {
	
	/**
	 * Realiza uma busca linear em um vetor de numeros inteiros
	 * @param vetor
	 * @param proc
	 * @return
	 */
	public static String procuraInt(int vetor[], int proc) {
		String resultado = null;
		
		for (int i = 0; i < vetor.length ; i ++) {
			if ( vetor[i] == proc) {
				resultado = "Valor " +proc +" encontrado no �ndice: "+i;
				break;
			} else if (vetor[i] > proc) {
				resultado = "O valor " +proc +" n�o existe na lista informada";
				break;
			}
		}
		
		return resultado;
	}
	
	/**
	 * Realiza busca linear em um vetor de Strings
	 * @param vetor
	 * @param proc
	 * @return
	 */
	public static String procuraString(String vetor[], String proc) {
		String resultado = "N�o encontrado";
		
		for (int i=0 ; i < vetor.length ; i++) {
			if (vetor[i].equals(proc)) {
				resultado = proc +" foi encontrado na posi��o: " +i;
				break;
			}
		}
		
		return resultado;
	}

	/**
	 * @param vet
	 * @param procurado
	 * @return
	 */
	public static int buscaLinearModificada (int vet[], int procurado) {
		int cont = 1;
	
	   	for(int i = 0; i < vet.length; i++) {
			if(vet[i] == procurado)
				return cont;
			
			cont++;           
		}
		return -1;
	}   
}
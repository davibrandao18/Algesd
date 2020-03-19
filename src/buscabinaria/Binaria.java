package buscabinaria;

/**
 * Classe para utilizacao de algoritmos de busca binaria
 * @author maicon
 */
public class Binaria {

	/**
	 * Realiza busca binaria em um vetor de numeros inteiros
	 * @param vetor
	 * @param proc
	 * @return
	 */
	public static String procuraInt(int vetor[], int proc) {
		int inicio = 0;
		int fim = vetor.length;
		int meio = (inicio + fim)/2;
		String resultado = "Nao encontrado !";
		
		while (inicio <= fim) {
			meio = (inicio + fim)/2;
			if ( vetor[meio] == proc) {
				resultado = "Encontrado o valor " +proc +" no indice: "+meio;
				break;
			} else if (vetor[meio] > proc) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return resultado;
	}
	
	public static String procuraString(String vetor[], String proc) {
		int inicio = 0;
		int fim = vetor.length;
		int meio = (inicio + fim)/2;
		String resultado = "Nao encontrado!";
		
		while (inicio <= fim) {
			meio = (inicio + fim)/2;
			if ( vetor[meio].equals(proc)) {
				resultado = "Encontrado " +proc +" no indice: "+meio;
				break;
			} else {
				// Se a string do meio for maior que a pretendida, a itera��o da variavel contadora � controlada
				// para n�o exceder o numero de caracteres da String menor para n�o dar um index of bounds.
				if (vetor[meio].length() > proc.length()) {
					for (int i = 0; i < proc.length(); i++) {
						if (vetor[meio].charAt(i) == proc.charAt(i)) {
							continue;
						} else if (vetor[meio].charAt(i) < proc.charAt(i)) {
							fim = meio - 1;
							break;
						} else if (vetor[meio].charAt(i) > proc.charAt(i)) {
							inicio = meio + 1;
							break;
						} else {
							// Se o nome for identico ate a quantidade de letras que o nome procurado tem, porem tiver
							// alguma letra a mais, significa que o nome pretendido esta atras
							fim = meio - 1;
						}
					}
				} else {
					// se n�o entrar em nenhum desses 'else if' significa que ou a string do meio e menor do que a string procurad, ou tem o mesmo tamanho,
					// no ultimo caso tanto faz qual string e utilizada para controlar a variavel contadora, logo, utiliza-se a mesma condicional.
					for (int i = 0; i < vetor[meio].length(); i++) {
						if (vetor[meio].charAt(i) == proc.charAt(i)) {
							continue;
						} else if (vetor[meio].charAt(i) < proc.charAt(i)) {
							fim = meio - 1;
							break;
						} else if (vetor[meio].charAt(i) > proc.charAt(i)) {
							inicio = meio + 1;
							break;
						} else {
							// Se o nome for identico ate a quantidade de letras que o nome procurado tem, porem tiver
							// alguma letra a mais, significa que o nome pretendido est� atr�s
							fim = meio - 1;
						}
					}
				}
			}
		}
		
		return resultado;
	}


	public static String buscaLinearModificada (int vet[], int procurado) {
		
		int min = 1; // passos minimos
		int cont = 1; // passos medios
		int max = vet.length; // maximo de passos
      
        for(int i = 0; i < vet.length; i++) {
            if(vet[i] == procurado)
			   return 	"minimo: " +min +"\n" +
						"Média de passos percorridos: " +cont +"\n" +
						"Máxima"    ;
            
            cont++;           
		}
		
        return "Não econtrado";
    }    

	/**
	 * 
	 * @param vet
	 * @param procurado
	 * @return
	 */
	public static int buscaBinariaModificada (int vet[], int procurado) {
		int cont = 1;
		int inicio = 0;
		int fim = vet.length - 1;
			
		while(inicio <= fim) {
			int meio = (inicio + fim) / 2;
				
			if(vet[meio] == procurado) {
				return cont;
			
			} else if (vet[meio] < procurado) {
				inicio = meio + 1;
			
			} else {
				fim = meio - 1;
			}
			cont++;
		}
		return -1;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static double maximoDeVezes(int n) {
		return Math.log(n);
	}
}
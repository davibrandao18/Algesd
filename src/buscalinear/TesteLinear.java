package buscalinear;

//Enunciados dos exercicios:

//Busca Linear
/*
* 2) Suponha agora que eu tenha um vetor em ordem crescente, por exemplo, x[]={-5, 0, 1, 2, 3, 4, 5, 8, 9}.
* Quero ainda fazer uma busca linear, contudo percebam que se eu tenho certeza que minha colecao esta ordenada,
* cabe uma otimizacao: imagine que eu esteja procurando o numero 6; ao percorrer o vetor e encontrar o elemento 8,
* eu poderei concluir que o 6 nao existe neste vetor, justamente porque ele esta ordenado, e encerrar a busca
* antes de chegar ao fim do vetor.
* Implemente uma variacao do algoritmo acima que faca esta otimizacao para busca linear em vetores ordenados.
*/

/*
* 3) Adapte o algoritmo acima para implementar busca linear numa colecao de nomes (Strings).
* Como a que faco em Java comparacao entre textos??
*/
public class TesteLinear {
	
	public static void main(final String args[]) {
		// 2)
		final int numerosOrdenados[] = { -5, 0, 1, 2, 3, 4, 5, 8, 9 };
		final int intProc = 8;
		System.out.println("LINEAR: " + Linear.procuraInt(numerosOrdenados, intProc));

		// 3)
		final String nomes[] = { "Ana", "Bruna", "Davi", "Elias", "Flavia" };
		final String strProc = "Davi";
		System.out.println("LINEAR: " + Linear.procuraString(nomes, strProc));
	}
}
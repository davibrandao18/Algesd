package buscabinaria;
import buscalinear.Linear;

//Enunciados dos exercicios:

//Busca binaria
/*
* 2) O que acontece quando tento fazer busca binaria em um vetor NAO ordenado?
*/

/*
* 3) Como voce implementaria busca binaria num vetor de Strings?
*/

/*
* 4) O programa abaixo serve para avaliar a quantidade de passos que os algoritmos busca linear
* e busca binaria gastam na execucao. Ele faz 2000 buscas de cada tipo e tira a media aritmetica
* do numero de passos gastos para ambos.
* Sua tarefa e modifica-lo para encontrar tambem o numero minimo e o maximo de passos para cada
* um dos algoritmos. Explique os resultados para seu professor.
*/

/*
* 5) Desafio: como voce calcularia o numero de passos maximo que levaria para uma busca binaria
* trabalhar sobre um vetor de tamanho N?
*/
public class TesteBinaria {
	
	public static void main(final String args[]) {
		// VARIÁVEIS DE TESTE
		final String nomes[] = { "Ana", "Bruna", "Davi", "Elias", "Flavia" };
		final int vetorDesordenado[] = { 5, 0, -1, 2, 3, -4, 5, -8, 9 };
		
		// 2)
		System.out.println("BINARIA: " + Binaria.procuraInt(vetorDesordenado, -4));

		// 3)
		System.out.println("BINARIA: " + Binaria.procuraString(nomes, "Davi"));

		// 4)
		final int vetQuatro[] = new int[1000];

		for (int i = 0; i < 1000; i++)
			vetQuatro[i] = i;

		int tempoLinear = 0, tempoBinaria = 0;

		for (int i = 0; i < 2000; i++) {
			final int aleatorio = (int) (Math.random() * 1000);
			tempoLinear = tempoLinear + Linear.buscaLinearModificada(vetQuatro, aleatorio);
			tempoBinaria = tempoBinaria + Binaria.buscaBinariaModificada(vetQuatro, aleatorio);
		}

		tempoLinear = tempoLinear / 2000;
		tempoBinaria = tempoBinaria / 2000;

		System.out.println(	"Tempo médio da Busca Linear: " + tempoLinear +"\n" +
							"Tempo mínimo: 1" +"\n" +
							"Tempo máximo: " + vetQuatro.length);

		System.out.println(	"Tempo médio da Busca Binária: " + tempoBinaria +"\n" +
							"Tempo mínimo: 1" +"\n" +
							"Tempo maximo: " +Binaria.maximoDeVezes(vetQuatro.length));

		// 5)
		System.out.println("Máximo de passos percorridos em uma busca binaria com vetor de 1000 espaços é de " +Binaria.maximoDeVezes(1000));
	}
}
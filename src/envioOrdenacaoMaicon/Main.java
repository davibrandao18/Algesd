package envioOrdenacaoMaicon;
/**
 * Classe utilizada somenta para chamar os métodos de execução predefinidos em cada classe
 * @author maiconspa
 *
 */
public class Main {
	public static void main(String args[]) {
		System.out.println("ORDENACAO 1 - Bubble Sort:");
		BubbleSort.executaBubble();

		System.out.println("\n\nORDENACAO 2 - Selection Sort:");
		SelectionSort.executaSelection();
		
		System.out.println("\n\nORDENACAO 3 - Insert sort:");
		InsertSort.executaInsert();
	}
}

package pilha;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String [] args) {
		Pilha p1 = new Pilha(50);
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Entre com (+,-,*,/): ");
		
		String entrada = leitura.nextLine();
		leitura.close();
		int numero = 0, display=0;
		char operador =' ';
		
		System.out.println("Display: "+display);
		
		//TODO WHILE
		
		try {
			numero = Integer.parseInt(entrada);
			p1.empilhar(numero);
		} catch (Exception e) {
			operador = entrada.charAt(0);
			System.out.println("foi um operador" + operador);
			int aux = p1.desempilhar();
			switch(operador) {
				case '+': display += aux; break;
				case '-': display -= aux; break;
				case '*': display *= aux; break;
				case '/': display /= aux; break;
					
			}
		}
	}
	
}

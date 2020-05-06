package pilha;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String [] args) {
		int numero = 0, display=0;
		char operador =' ';
		
		Pilha p1 = new Pilha(50);
		Scanner leitura = new Scanner(System.in);
		System.out.println("Entre com um número ou um operador (+,-,*,/): ");
		String entrada = leitura.nextLine();
		numero = Integer.parseInt(entrada);
		p1.empilhar(numero);
		
		while (p1.vazia() == false) {
			display = numero;
			entrada = leitura.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				p1.empilhar(numero);
			} catch (Exception e) {
				operador = entrada.charAt(0);
				//System.out.println("Opreração:" + operador);
				int aux = p1.desempilhar();
				//System.out.println("Servidor:"+aux);
				switch(operador) {
					case '+': numero += aux; break;
					case '-': numero -= aux; break;
					case '*': numero *= aux; break;
					case '/': numero /= aux; break;
						
				}
				System.out.println("Display: "+numero);
			}
		}
		leitura.close();
	}
	
}

package pilha_maicon;

import java.util.Scanner;

public class TestePilha
{
	/**
	 * Método default do blog ALGESD.BLOGSPOT.COM
	 */
	public static void testePilhaInt() {
		Pilha p1 = new Pilha(10);
		Pilha p2 = new Pilha(10);
  
		p1.empilhar(1);
		p1.empilhar(2);
		p1.empilhar(3);
		p1.empilhar(4);
		p1.empilhar(5);
		p1.empilhar(6);
		p1.empilhar(7);

		while(! p1.vazia())
		{
			int aux = p1.desempilhar();
			System.out.println(aux);
			p2.empilhar( aux );
		}
  
		while(! p2.vazia())
		{
			System.out.println(p2.desempilhar());
		}
	}
	
	public static void testePilhaStr() {
		String padrao = "batata";
		String desempilhada = "";
		Pilha p1 = new Pilha(7);
		
		p1.empilharStr('b');
		p1.empilharStr('a');
		p1.empilharStr('t');
		p1.empilharStr('a');
		p1.empilharStr('t');
		p1.empilharStr('a');
		
		while(! p1.vazia())
		{
			char aux = p1.desempilharStr();
			System.out.println("Letra coletada: " +aux);
			desempilhada += aux;
		}
		
		if (padrao.equals(desempilhada)) System.out.println(padrao +" é palíndrome");
		else System.out.println(padrao +" não é palíndrome");
	}
	
	public static void calculadoraHP() {
		Scanner in = new Scanner(System.in);
		Pilha pilha = new Pilha(1);
		pilha.empilhar(0); // padrão começar com zero
		boolean continuar = true;
		int numero;
		int resultado;
		char operador = ' ';
		String inserido = "";
		String display = "\n____________________\n|\n|  ";
		
		System.out.println("Entre com um numero ou operador (+,-,*,/):");
		while (continuar == true) {
			inserido = in.nextLine();
			try {
				numero = Integer.parseInt(inserido);
				pilha.empilhar(numero);
				display = "\n____________________\n|\n|  ";
				display += numero;
				System.out.println(display);
				continuar = true;
				
			} catch(Exception e) {
				operador = inserido.charAt(0);
				display += operador;
				System.out.println(display);
				
				switch (operador) {
				case '+': {
					numero = Integer.parseInt(inserido);
					resultado = pilha.desempilhar() + numero;
					display = "\n____________________\n|\n|  =";
				}
				case '-': {
					numero = Integer.parseInt(inserido); break;
				}
				case '*': {
					numero = Integer.parseInt(inserido); break;
				}
				case '/': {
					numero = Integer.parseInt(inserido); break;
				}
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args)
	{
		calculadoraHP();
	}
	
	// 1) Aparece primariamente em ordem contrária ao empilhamento pois o ultimo elemento é o primeiro a ser retirado, ao fim de cada desempilhamento(numero retirado da pilha1) o mesmo é empilhado(adicionado) á pilha2 que assim vai recebendo primeiro os numeros que estavam no topo da pilha anterior e ao fim desse processo, a pilha2 é desempilhada, exibindo assim os numeros como na sequencia original, uma vez que ouve uma inversão da inversão feita na primeira pilha
}
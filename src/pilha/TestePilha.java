package pilha;

import java.util.Scanner;

public class TestePilha {
	
	 public static void main(String[] args){
		 Pilha p1 = new Pilha(10);
		 Pilha p2 = new Pilha(10);
		  
		 p1.empilhar(1);
		 p1.empilhar(2);
		 p1.empilhar(3);
		 p1.empilhar(4);
		 p1.empilhar(5);
		 p1.empilhar(6);
		 p1.empilhar(7);
		
		 while(! p1.vazia()) {
			 int aux = p1.desempilhar();
			 System.out.println(aux);
			 p2.empilhar( aux );
		 }
		 
		 while(! p2.vazia()){
			 System.out.println(p2.desempilhar());
		 }
		 
		 Scanner leitura = new Scanner(System.in);
		 String palavra = leitura.nextLine();
		 leitura.close();
		 
		 PilhaString p3 = new PilhaString(palavra.length());
		 
		 for (int i = 0; i < palavra.length(); i++) {
			 p3.empilhar(palavra.charAt(i));
		 }
		 
		 String invertida ="";
		 while (! p3.vazia()) {
			 invertida += p3.desempilhar();
		 }
		 
		 if (invertida.equals(palavra)) {
			 System.out.println("É palindrome");
		 } else {
		 System.out.println("Não é palindrome");
		 }
	 }

}

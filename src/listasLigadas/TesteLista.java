package listasLigadas;

public class TesteLista {
	
 public static void main(String args[]) {
	 
	 ListaLigadaSimples lista = new ListaLigadaSimples();
     lista.adicionarInicio(22);
     lista.adicionarInicio(1);
     lista.adicionarInicio(7);
     lista.adicionarFim(12);
     
     ListaLigadaSimples lista2 = new ListaLigadaSimples();
     lista2.adicionarInicio(22);
     lista2.adicionarInicio(1);
     lista2.adicionarInicio(2);
     lista2.adicionarFim(11);
     
     System.out.println("Lista no princ�pio: " + lista);
     System.out.println("Lista � crescente?  " + lista.crescente());
     System.out.println("M�nimo elemento " + lista.minimo());
     System.out.println("M�nimo recursivo elemento " + lista.minimoRecursivo(lista.inicio));
     System.out.println("Lista � igual � Lista2 ? " + lista.iguais(lista2));
     System.out.println("Recursivo: Lista � igual � Lista2 ? " + lista.iguaisRecursivo(lista2, lista.inicio, lista2.inicio));
     System.out.println("Ponto m�dio da lista = " + lista.pontoMedio());
     
     System.out.println("soma: " +lista.somaChaves(lista.inicio));
     
     System.out.println("O elemento 7 existe na lista? Resposta: " + lista.existe(7));
     System.out.println("Recursivo O elemento 7 existe na lista? Resposta: " + lista.existeRecursivo(7, lista.inicio));
     
     System.out.println("Removi o primeiro: " + lista.removerInicio());
     System.out.println("Lista ap�s remo��o: " + lista);
     System.out.println("Removi o �ltimo: " + lista.removerFim());
     System.out.println("Lista ap�s remo��o: " + lista);
     
     ListaLigadaSimples.pilhaListaLigada();
     ListaLigadaSimples.filaListaLigada();
     
     lista.inverter();
     System.out.println("\nInvertendo a lista: " + lista);
     
  }
	
}

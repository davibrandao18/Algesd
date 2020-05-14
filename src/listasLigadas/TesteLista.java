package listasLigadas;

public class TesteLista {
	
 public static void main(String args[]) {
	 
	 ListaLigadaSimples lista = new ListaLigadaSimples();
     lista.adicionarInicio(22);
     lista.adicionarInicio(1);
     lista.adicionarInicio(2);
     lista.adicionarFim(11);
     lista.adicionarFim(12);
     
     ListaLigadaSimples lista2 = new ListaLigadaSimples();
     lista2.adicionarInicio(22);
     lista2.adicionarInicio(1);
     lista2.adicionarInicio(2);
     lista2.adicionarFim(11);
     
     System.out.println("Lista no princípio: " + lista);
     System.out.println("Lista é crescente?  " + lista.crescente());
     System.out.println("Mínimo elemento " + lista.minimo());
     System.out.println("Mínimo recursivo elemento " + lista.minimoRecursivo(lista.inicio));
     System.out.println("Lista é igual à Lista2 ? " + lista.iguais(lista2));
     System.out.println("Lista é igual à Lista2 ? " + lista.iguaisRecursivo(lista2, lista.inicio, lista2.inicio));
     System.out.println("Ponto médio da lista = " + lista.pontoMedio());
     lista.inverter();
     System.out.println("Invertendo a lista: " + lista);
     
     System.out.println("Removi o primeiro: " + lista.removerInicio());
     System.out.println("Lista após remoção: " + lista);
     System.out.println("Removi o último: " + lista.removerFim());
     System.out.println("Lista após remoção: " + lista);
     System.out.println("O elemento 7 existe na lista? Resposta: " + lista.existe(7));
  
  }
	
}

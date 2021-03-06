package listasLigadas;

public class ListaLigadaSimples {

	   public Nodo inicio, fim;
	   public int quantidade;
	  
	   public ListaLigadaSimples(){
	      this.inicio = null;
	      this.fim = null;
	      this.quantidade = 0;
	   }
	   
	   public void adicionarInicio(int x){
	      if(quantidade == 0){
	         Nodo novo = new Nodo();
	         novo.dado = x;
	         novo.link = null;
	         inicio = novo;
	         fim = novo;
	         quantidade = 1;
	      }else //j� existem elementos na lista
	      {
	         Nodo novo = new Nodo();
	         novo.dado = x;
	         novo.link = inicio;
	         inicio = novo;
	         quantidade++;
	      }
	   }
	  
	   public void adicionarFim(int x){
	      if(quantidade == 0){
	         Nodo novo = new Nodo();
	         novo.dado = x;
	         novo.link = null;
	         inicio = novo;
	         fim = novo;
	         quantidade = 1;
	      }else //j� existem elementos na lista
	      {
	         Nodo novo = new Nodo();
	         novo.dado = x;
	         novo.link = null;
	         fim.link = novo;
	         fim = novo;
	         quantidade++;
	      }
	   }
	  
	   public int removerInicio(){
	      if(quantidade==0) throw new RuntimeException(); //lance exce��o
	      else if(quantidade==1){
	         int aux = inicio.dado;
	         inicio = null;
	         fim = null;
	         quantidade=0;
	         return aux;
	      }else{
	         int aux = inicio.dado;
	         inicio = inicio.link;
	         quantidade--;
	         return aux;
	      }
	   }
	  
	   public int removerFim(){
	      if(quantidade==0) throw new RuntimeException(); //lance exce��o
	      else if(quantidade==1){
	         int aux = inicio.dado;
	         inicio = null;
	         fim = null;
	         quantidade=0;
	         return aux;
	      }else{
	         int aux = fim.dado;
	         Nodo penultimo = inicio;
	         while(penultimo.link != fim)
	         {
	            penultimo = penultimo.link;
	         }
	         fim = penultimo;
	         penultimo.link = null;
	         quantidade--;
	         return aux;
	      }
	   }
	  
	  
	   public boolean existe(int elemento){
	      Nodo aux=inicio;
	      while(aux != null)
	      {
	         if(aux.dado == elemento)
	            return true;
	         else aux = aux.link;
	      }
	      return false;
	   }
	   
	   public boolean existeRecursivo(int elemento, Nodo atual){
		   if (atual == null) return false;
		   if (atual.dado == elemento) return true;
		   return existeRecursivo(elemento, atual.link);
	   }
	  
	  
	   public String toString(){
	      Nodo nodo = inicio;
	      String saida = "INICIO -> ";
	      for(int i=0; i<quantidade;i++)
	      {
	         saida = saida + nodo.dado + " -> ";
	         nodo = nodo.link;
	      }
	      saida = saida + "FIM";
	      return saida;
	   }
	   
	   public boolean crescente() {
		   Nodo aux = inicio;
		   for(int i = 1; i <= quantidade-1; i++) {
			   if(aux.dado > aux.link.dado) {
				   return false;
			   } else {
				   aux = aux.link;
			   }
	        }
	        return true;
	   }
	   
	   public Nodo minimo() {
		   if(quantidade==0) return null;
		   Nodo min = inicio;
		   Nodo aux = inicio.link;
		   while(aux != null) {
			   if(aux.dado < min.dado) {
				  min = aux; 
			   }
			   aux = aux.link;
		   }
		   return min;
		   
	   }
	   
	   public Nodo minimoRecursivo(Nodo primeiro) {
		  if(primeiro == null) return null;
		  if(primeiro.link == null) return primeiro;
		  Nodo menorDoRestoDaLista = minimoRecursivo(primeiro.link);
		  if (primeiro.dado < menorDoRestoDaLista.dado) return primeiro;
		  else return menorDoRestoDaLista;
		  
	   }
	   
	   public boolean iguais(ListaLigadaSimples lista2){
		   if(quantidade != lista2.quantidade) return false;
	        Nodo aux1 = inicio;
	        Nodo aux2 = lista2.inicio;
	        for(int i=0; i<quantidade; i++){   
	        	if(aux1.dado != aux2.dado) {
	                return false;
	        	}else{
	        		aux1 = aux1.link;
	                aux2 = aux2.link;
	            }
	        }
	        return true;
	   }
	   
	   public boolean iguaisRecursivo(ListaLigadaSimples lista2, Nodo inicio, Nodo inicio2){
		   if(quantidade != lista2.quantidade) return false;
		   if(inicio == fim) return true;
		   if(inicio.dado != inicio2.dado) { 
			   return false;
		   } else {
			   return iguaisRecursivo(lista2, inicio.link, inicio2.link);
		   }
	   }
	   
	   public Nodo pontoMedio() {
		   if(quantidade==0) return null;
		   if(quantidade==1) return inicio;
		   Nodo aux = inicio;
		   for(int i = 1; i <= quantidade/2; i++) {
			   aux = aux.link;
		   }
		   return aux;
		   
	   }
	   
	   public void inverter() {
		   if(quantidade <= 1) return;
		   Nodo primeiro = inicio; //primeiro elemento
		   for (int i=0; i<quantidade-1; i++) {
		   Nodo seguinte = primeiro.link; //segundo, terceiro, quarto ... elemento
		   primeiro.link = seguinte.link; // removendo o seguinte
		   quantidade--; // Atualizando corretamente o etributo quantidade;
		   adicionarInicio(seguinte.dado);
		   }
	   }
	   
	   public static void pilhaListaLigada() {
		   ListaLigadaSimples lista = new ListaLigadaSimples();
		   Pilha p = new Pilha(10);
		   
		   System.out.println("\npilhaListaLigada");
		   
		   p.empilhar(1);
		   p.empilhar(2);
		   p.empilhar(3);
		   p.empilhar(4);
		   p.empilhar(5);
		   p.empilhar(6);
		   p.empilhar(7);
		   
		   lista.adicionarInicio(p.desempilhar());
		   lista.adicionarInicio(p.desempilhar());
		   lista.adicionarInicio(p.desempilhar());
		   lista.adicionarInicio(p.desempilhar());
		   lista.adicionarInicio(p.desempilhar());
		   lista.adicionarInicio(p.desempilhar());
		   lista.adicionarInicio(p.desempilhar());

		   System.out.println(lista.toString());
	   }
	   
	   public static void filaListaLigada() {
		   ListaLigadaSimples lista = new ListaLigadaSimples();
		   Fila f = new Fila(10);
		   
		   System.out.println("\nfilaListaLigada");
		   
		   for(int i = 1; i <= 10; i++) {
			   	lista.adicionarFim(i);
				f.enfileirar(i);
		   }
		   
		   for(int i = 1; i <= 10; i++) {
			   System.out.println("Desenfileirou: "+f.desenfileirar());
			
		   }
		   System.out.println(lista.toString());
	   }
	   
	   public ListaLigadaSimples concatenar(ListaLigadaSimples lista){
		   lista.fim.link = inicio;
		   return lista;
	   }
	   
	   public int somaChaves(Nodo inicio) {
		   if (inicio == null) return 0;
		   if (inicio.link == null) return inicio.dado;
		   else return inicio.dado + somaChaves(inicio.link);
	   }
}

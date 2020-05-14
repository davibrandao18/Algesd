package listaLigadaSimplesMaicon;

class ListaLigadaSimples
{
   public Nodo inicio, fim;
   public int quantidade;
  
   public ListaLigadaSimples()
   {
      inicio = null;
      fim = null;
      quantidade = 0;
   }

   public void adicionarInicio(int x)
   {
      if(quantidade == 0)
      {
         Nodo novo = new Nodo();
         novo.dado = x;
         novo.link = null;
         inicio = novo;
         fim = novo;
         quantidade = 1;
      }
      else //já existem elementos na lista
      {
         Nodo novo = new Nodo();
         novo.dado = x;
         novo.link = inicio;
         inicio = novo;
         quantidade++;
      }
   }
  
   public void adicionarFim(int x)
   {
      if(quantidade == 0)
      {
         Nodo novo = new Nodo();
         novo.dado = x;
         novo.link = null;
         inicio = novo;
         fim = novo;
         quantidade = 1;
      }
      else //já existem elementos na lista
      {
         Nodo novo = new Nodo();
         novo.dado = x;
         novo.link = null;
         fim.link = novo;
         fim = novo;
         quantidade++;
      }
   }
  
   public int removerInicio()
   {
      if(quantidade==0) throw new RuntimeException(); //lance exceção
      else if(quantidade==1)
      {
         int aux = inicio.dado;
         inicio = null;
         fim = null;
         quantidade=0;
         return aux;
      }
      else
      {
         int aux = inicio.dado;
         inicio = inicio.link;
         quantidade--;
         return aux;
      }
   }
  
   public int removerFim()
   {
      if(quantidade==0) throw new RuntimeException(); //lance exceção
      else if(quantidade==1)
      {
         int aux = inicio.dado;
         inicio = null;
         fim = null;
         quantidade=0;
         return aux;
      }
      else
      {
         int aux = fim.dado;
         Nodo penultimo=inicio;
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
  
  
   public boolean existe(int elemento)
   {
      Nodo aux=inicio;
      while(aux != null)
      {
         if(aux.dado == elemento)
            return true;
         else aux = aux.link;
      }
      return false;
   }
  
  
   public String toString()
   {
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
       for(int i=1; i <= quantidade-1; i++) {
    	   if(aux.dado > aux.link.dado) return false;
    	   else aux = aux.link;
       }
       return true;
   }
   
   
   public Nodo minimo() {
	   if(quantidade==0) return null;
       Nodo min = inicio;
       Nodo aux = inicio.link;
       while(aux != null) {
    	   if(aux.dado < min.dado) min = aux;
           
    	   aux = aux.link;
       }
       return min;
   }
   
   public Nodo minimoRec(Nodo primeiro) {
	   if(primeiro == null) return null;
       if(primeiro.link == null) return primeiro;
       Nodo menorDoRestoDaLista = minimoRec(primeiro.link);
       if(primeiro.dado < menorDoRestoDaLista.dado) return primeiro;
       else return menorDoRestoDaLista;
   }
   
   public boolean iguais(ListaLigadaSimples lista2) {
	   Nodo aux1 = inicio;
       Nodo aux2 = lista2.inicio;
	   
	   if(quantidade != lista2.quantidade) return false;
       for(int i=0; i<quantidade; i++) {
    	   if(aux1.dado != aux2.dado) return false;
           else {
        	   aux1 = aux1.link;
               aux2 = aux2.link;
           }
       }
       return true;
   }
   
   public boolean iguaisRec(ListaLigadaSimples lista2, Nodo aux1, Nodo aux2, int inicio) {
	   if(quantidade != lista2.quantidade) return false;
	   if(aux1.dado != aux2.dado) return false;
	   if(inicio>=quantidade) return true;
	   return iguaisRec(lista2, aux1.link, aux2.link, inicio+1);
   }
   
   // TODO 3, 9 ... 11
}

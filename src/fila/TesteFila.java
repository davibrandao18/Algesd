package fila;

public class TesteFila
{ 
    public static void main(String[] args)
   {
      Fila f = new Fila(10);
   
      System.out.println("Colocando 8 n�meros na fila.");
      for(int i = 1; i <= 8; i++)
         f.enfileirar(i);
   
      System.out.println("Retirando todos os elementos da fila:");
      while(! f.vazia())
      {
         System.out.println( f.desenfileirar() );
      }
   
      System.out.println("Colocando mais 10 n�meros na fila.");
   
      for(int i = 9; i <= 18; i++)
         f.enfileirar(i);
   
      System.out.println("Retirando todos os elementos da fila:");
   
      while(! f.vazia())
      {
         System.out.println( f.desenfileirar() );
      }
   }
}

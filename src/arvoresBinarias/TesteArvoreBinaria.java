package arvoresBinarias;

public class TesteArvoreBinaria
{
   static int indice = 0;

   public static void emOrdemModificado(int vet[], No raiz)
   {  if(raiz != null)
      {  emOrdemModificado(vet, raiz.esquerda);
         vet[indice] = raiz.chave;
         indice++;
         emOrdemModificado(vet, raiz.direita);
      }
   }

   public static void ordenarVetor(int vet[])
   {  ArvoreBinaria ab = new ArvoreBinaria();
 
      for(int i=0; i<vet.length; i++)
      {  ab.insere( vet[i] );
      }
 
      emOrdemModificado(vet, ab.getRaiz());
   }

   public static void main (String [] args)
   {  System.out.println ("Arvore Binaria (de numeros inteiros)");
      ArvoreBinaria ab = new ArvoreBinaria ();
 
      ab.insere(5);
      ab.insere(7);
      ab.insere(3);
      ab.insere(2);
      ab.insere(1);
      ab.insere(9);
      ab.insere(8);
      ab.insere(4);
      ab.insere(6);
 
      System.out.println ("Inserindo 5, 7, 3, 2, 1, 9, 8, 4, 6\n\n"
         + "A arvore em ordem sera assim: "
         + ab.emOrdem());
      System.out.println (ab);
      
      System.out.println("2) Esta árvore tem "+ ab.numeroNos(ab.getRaiz()) + " nós.");
      System.out.println("3) A soma das chaves desta árvore é = " + ab.somaRecursivaChaves(ab.getRaiz()));
      System.out.println("4) As folhas desta árvore são " + ab.exibeFolhas(ab.getRaiz()));
      System.out.println("5) A altura desta árvore é = " + ab.alturaArvore(ab.getRaiz()));
      System.out.println("6.a) O maior elemento desta árvore é = " + ab.maiorElemento(ab.getRaiz()));
      System.out.println("6.b) O menor elemento desta árvore é = " + ab.menorElemento(ab.getRaiz()));
      
      
      System.out.println ("\nRemovendo o 5 ......");
      ab.remove(ab.procurar(5));
      System.out.println (ab);
      System.out.println ("\nRemovendo o 8 ......");
      ab.remove(ab.procurar(8));
      System.out.println (ab);
      System.out.println ("\nRemovendo o 3 ......");
      ab.remove(ab.procurar(3));
      System.out.println (ab);
      System.out.println("O antecessor de " + ab.getRaiz().chave + " eh " + ab.getRaiz().antecessor() + " e o sucessor eh " + ab.getRaiz().sucessor());
      System.out.println("\nTestando o metodo ordenarVetor:\nAntes: ");
      int vet[] = {6, 3, 8, -1, 10, 13, 7};
      for(int i=0; i<vet.length; i++)
         System.out.print(vet[i] + " ");
      ordenarVetor(vet);
      System.out.println("\nDepois: ");
      for(int i=0; i<vet.length; i++)
         System.out.print(vet[i] + " ");
   }
}
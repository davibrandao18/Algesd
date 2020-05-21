package arvoresBinarias;

class ArvoreBinaria
{  private No raiz;

   public ArvoreBinaria ()
   {  raiz = null;
   }

   public No getRaiz()
   {  return raiz;
   }

   public void insere (int chave)
   {  No novo = new No ();
      novo.chave = chave;
      novo.esquerda = novo.direita = null;
 
      if(raiz == null)
      {  novo.pai = null;
         raiz = novo;
      }
      else
      {  No aux = raiz, pai = null;
    
         while (aux != null)
         {  if(aux.chave == chave)
               return; //o "chave" ja existe
            else if (aux.chave < chave)
            {  pai = aux;
               aux = aux.direita; //passo a procurar aa direita
            }
            else
            {  pai = aux;
               aux = aux.esquerda; //passo a procurar aa esquerda
            }
         }
    
         if(pai.chave > chave) pai.esquerda = novo;
         else pai.direita = novo;
    
         novo.pai = pai;
      }
   }

   public void remove (No n)
   {  if (raiz == null)
         throw new RuntimeException ("Lista vazia.");
      else
      {  int numFilhos = n.numeroFilhos();
    
         if(numFilhos == 0) // folha
         {  if(n==raiz) raiz = null;
            else
            {  if(n.pai.chave > n.chave) n.pai.esquerda = null;
               else n.pai.direita = null;
            }
         }
         else if(numFilhos == 1) // tem 1 filho
         {  No filho;
            if(n.esquerda != null) filho = n.esquerda;
            else filho = n.direita;
       
            if(n==raiz) raiz = filho;
            else
            {  if(n.pai.chave > n.chave) n.pai.esquerda = filho;
               else n.pai.direita = filho;
            }
         }
         else // tem 2 filhos
         {  No substituto = n.antecessor();
            remove(substituto);
            n.chave = substituto.chave;
         }
      }
   }

   public boolean contem (int chave)
   {  No aux = raiz;
 
      while (aux != null)
      {  if(aux.chave == chave)
            return true; //se encontrei, retorno true
         else if (aux.chave < chave) aux = aux.direita; //passo a procurar aa direita
         else aux = aux.esquerda; //passo a procurar aa esquerda
      }
      return false; //se chegou aqui eh porque nao existe
   }

   public No procurar (int chave)
   {  No aux = raiz;
 
      while (aux != null)
      {  if(aux.chave == chave)
            return aux; //se encontrei, retorno a referencia
         else if (aux.chave < chave) aux = aux.direita; //passo a procurar aa direita
         else aux = aux.esquerda; //passo a procurar aa esquerda
      }
      return null; //se chegou aqui eh porque nao existe
   }

   private String espacos (int n)
   {  String s="";
      for(int i=0; i<n; i++)
         s = s + "      ";
      return s;
   }

   public String toString ()
   {  return mostra(raiz, 1);
   }

   private String mostra(No n, int nivel)
   {  if(n==null) return "";
      else
         return mostra(n.direita, nivel + 1) + "\n"
            + espacos(nivel) + n.chave + "\n"
            + mostra(n.esquerda, nivel + 1);
   }

   public String emOrdem(No raiz)
   {  if(raiz == null) return "";
      else
         return emOrdem(raiz.esquerda) + " "
            + raiz.chave + " " +
     emOrdem(raiz.direita);
   }
   public String emOrdem()
   {  return emOrdem(raiz);
   }
   
   /*
    * 2) Implemente um m�todo recursivo que conte a quantidade de elementos de uma �rvore bin�ria.
    * Dicas: o m�todo receber� a refer�ncia da raiz como par�metro. Se esta for nula a quantidade de elementos � zero;
    * Caso contr�rio, a quantidade de elementos � igual a quantidade de elementos da sub-�rvore � esquerda mais a quantidade
    * de elementos da sub-�rvores � direita mais um (que � a raiz).
    */
   public int numeroNos(No raiz){
	   if (raiz == null)return 0;
	   else return numeroNos(raiz.direita) + numeroNos(raiz.esquerda) + 1;
   }
   
   /*
    * 3) Implemente um m�todo recursivo que some as chaves dos n�s de uma �rvore bin�ria.
    */
   public int somaRecursivaChaves(No raiz) {
	   if (raiz == null)return 0;
	   else return raiz.chave + somaRecursivaChaves(raiz.direita) + somaRecursivaChaves(raiz.esquerda);
   }
   
   /*
    * 4) Implemente um m�todo que receba a refer�ncia da raiz de uma �rvore e mostre na tela todos os n�s folha da �rvore.
    */
   public String exibeFolhas(No raiz) {
	   if (raiz == null) return "";
	   if(raiz.esquerda == null && raiz.direita == null)return raiz.chave+"/";
	   else return exibeFolhas(raiz.direita).toString() + exibeFolhas(raiz.esquerda).toString();
   }
   
   /*
    * 5) Construa um m�todo que retorne a altura da �rvore.
    * Lembrando que: A altura da �rvore � igual a altura da maior sub-�rvore + 1.
    * E � igual zero se a raiz � vazia.
    */
   public int alturaArvore(No raiz) {
	   if (raiz == null)return 0;
	   int d = alturaArvore(raiz.direita);
	   int e = alturaArvore(raiz.esquerda);
	   if ( d > e) return d + 1;
	   return e + 1;
   }
   
   /*
    * 6) Construa um m�todo que retorne o valor do maior elemento da �rvore e outro para o menor.
    */
   public int maiorElemento(No raiz) {
	   if (raiz == null)return 0;
	   if (raiz.direita == null) return raiz.chave;
	   return maiorElemento(raiz.direita);
   }
   public int menorElemento(No raiz) {
	   if (raiz == null)return 0;
	   if (raiz.esquerda == null) return raiz.chave;
	   return menorElemento(raiz.esquerda);
   }
   
}
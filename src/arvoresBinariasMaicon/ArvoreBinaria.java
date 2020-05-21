package arvoresBinariasMaicon;

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
   
   public int contaNos(No raiz) {
	   if (raiz == null) return 0;
	   else return contaNos(raiz.esquerda) +contaNos(raiz.direita) +1;
   }
   
   public int somaChaves(No raiz) {
	   if (raiz == null) return 0;
	   else return raiz.chave + somaChaves(raiz.esquerda) + somaChaves(raiz.direita);
   }
   
   public String exibirFolhas(No raiz) {
	   if (raiz == null) return "";
	   if (raiz.esquerda == null && raiz.direita == null) return raiz.toString();
	   else return exibirFolhas(raiz.esquerda) + exibirFolhas(raiz.direita);
   }
   
   public int alturaArvore(No raiz) {
	   if (raiz == null) return 0;
	   int a = alturaArvore(raiz.direita);
	   int b = alturaArvore(raiz.esquerda);
	   if (a > b) return a + 1;
	   else return b + 1;
   }
   
   public int menor(No raiz) {
	   if (raiz == null) return 0;
	   int a = menor(raiz.direita);
	   int b = menor(raiz.esquerda);
	   if (raiz.direita == null && raiz.esquerda == null) return raiz.chave;
	   if (raiz.esquerda == null && raiz.direita != null) return menor(raiz.direita);
	   if (raiz.direita == null && raiz.esquerda != null) return menor(raiz.esquerda);
	   return a < b ? a : b;
   }
   
   public int maior(No raiz) {
	   if (raiz == null) return 0; //
	   int a = maior(raiz.direita);
	   int b = maior(raiz.esquerda);
	   if (raiz.direita == null && raiz.esquerda == null) return raiz.chave;
	   if (raiz.esquerda == null && raiz.direita != null) return maior(raiz.direita);
	   if (raiz.direita == null && raiz.esquerda != null) return maior(raiz.esquerda);
	   return a > b ? a : b;
   }
}
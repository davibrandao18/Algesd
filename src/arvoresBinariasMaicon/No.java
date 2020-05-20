package arvoresBinariasMaicon;

class No
{  int chave;
   No pai, esquerda, direita;
   // agora cada No sabera quem eh seu pai, seu filho da esquerda e da direita
 
   public No antecessor ()
   {  No n, ant;
      ant = n = esquerda;
    
      while (n != null)
      {  ant = n;
         n = n.direita;
      }
    
      return ant;
   }
 
   public No sucessor ()
   {  No n, suc;
      suc = n = direita;
    
      while (n != null)
      {  suc = n;
         n = n.esquerda;
      }
    
      return suc;
   }
 
   public int numeroFilhos()
   {
      if(esquerda == null && direita == null)
         return 0;
      else if (esquerda != null && direita != null)
         return 2;
      else
         return 1;
   }
 
   public String toString ()
   {  
      return "<" + chave + ">";
   }
}
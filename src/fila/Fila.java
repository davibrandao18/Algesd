package fila;

class Fila {
    private int vet[];
    private int inicio, fim, quantidade;
 
     public Fila(int tamanho)
    {
       vet = new int[tamanho];
       inicio = fim = quantidade = 0;
    }
 
     public void enfileirar(int x)
    {
       vet[fim] = x;
       fim++;
       quantidade++;
       if (fim == vet.length)
          fim = 0;
    }
 
     public int desenfileirar()
    {
       int resp = vet[inicio];
       inicio++;
       quantidade--;
       if (inicio == vet.length)
          inicio = 0;
       return resp;
    }
 
     public boolean vazia()
    {
       if (quantidade == 0) 
          return true;
       else 
          return false;
    }
 
     public boolean cheia()
    {
       if (quantidade == vet.length) 
          return true;
       else 
          return false;
    }
 }

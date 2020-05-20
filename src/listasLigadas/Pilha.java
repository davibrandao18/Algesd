package listasLigadas;

class Pilha {
	 private int vet[];
	 private int topo;

	 public Pilha(int tamanho)
	 {
	  vet = new int[tamanho];
	  topo = -1;
	 }

	 public void empilhar(int x)
	 {
	  topo++;
	  vet[topo] = x;
	  System.out.println("empilhou: " +x);
	 }

	 public int desempilhar()
	 {
	  int aux = vet[topo];
	  topo--;
	  System.out.println("desempilhou: " +aux);
	  return aux;
	 }
}

	
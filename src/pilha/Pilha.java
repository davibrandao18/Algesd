package pilha;

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
	 }

	 public int desempilhar()
	 {
	  int aux = vet[topo];
	  topo--;
	  return aux;
	 }

	 public boolean vazia()
	 {
	  if (topo == -1) return true;
	  else return false;
	 }
	}

	
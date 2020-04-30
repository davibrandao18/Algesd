package pilha;

public class PilhaString {
	
	private char vet[];
	private int topo;

	 public PilhaString(int tamanho){
	  vet = new char[tamanho];
	  topo = -1;
	 }
	
	 public void empilhar(char x)
	 {
	  topo++;
	  vet[topo] = x;
	 }
	
	 public char desempilhar()
	 {
	  char aux = vet[topo];
	  topo--;
	  return aux;
	 }
	
	 public boolean vazia()
	 {
	  if (topo == -1) return true;
	  else return false;
	 }
	
}

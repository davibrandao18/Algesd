package pilha_maicon;

public class Pilha {
	private int vet[];
	private char chars[];
	private int topo;

	public Pilha(int tamanho)
	{
		vet = new int[tamanho];
		topo = -1;
	}
	
	/*
	public Pilha(int tamanho)
	{
		chars = new char[tamanho];
		topo = -1;
	}*/

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
	
	// Alterado para funcionar com Strings:
	public void empilharStr(char c)
	{
		topo++;
		chars[topo] = c;
	}

	public char desempilharStr()
	{
		char aux = chars[topo];
		topo--;
		return aux;
	}
}
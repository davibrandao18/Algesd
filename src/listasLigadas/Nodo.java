package listasLigadas;

public class Nodo {
	
	public int dado;
	public Nodo link; //referência
	
	public Nodo() {};
	
	public Nodo(int dado, Nodo link) {
		this.dado = dado;
		this.link = link;
	}

	/**
	 * @return the dado
	 */
	public int getDado() {
		return dado;
	}

	/**
	 * @param dado the dado to set
	 */
	public void setDado(int dado) {
		this.dado = dado;
	}

	/**
	 * @return the link
	 */
	public Nodo getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(Nodo link) {
		this.link = link;
	}
	
	public String toString() {
		return ""+dado;
	}
	
}

package base;
public class Node {
	private Node prox;
	private Node ant;
	private Object musica; 

	public Node(Object musica) {
		this.musica = musica;
		prox = null;
		ant = null;
		
	}

	public Node getAnt() {
		return ant;
	}

	public void setAnt(Node ant) {
		this.ant = ant;
	}

	public Node getProx() {
		return prox;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	}

	public Object getMusica() {
		return musica;
	}

	public void setMusica(Object musica) {
		this.musica = musica;
	}


}


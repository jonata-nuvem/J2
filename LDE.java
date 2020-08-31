package base;

public class LDE {
		private Node cabeca = null;
		private Node cauda = null;
		private int tamanho = 0;

//adicionar na cabeça/////////////////////////////////////////////////////////////////////////
		public void addCabeca(Object musica) {
			Node novo = new Node(musica);

			if (isEmpty()) {
				cabeca = novo;
				cauda = novo;
			} else {
				cabeca.setAnt(novo);//cabeca <--novo
				novo.setProx(cabeca);//novo -->cabeca
				cabeca = novo; //cabeca = novo 
			}
			tamanho++;
		}

// remover da cabeça //////////////////////////////////////////////////////////////////
		public Object removerCabeca() {
			if (isEmpty()) return null;

			Node aux = cabeca;
			if(cabeca.getProx() != null) {
			cabeca = cabeca.getProx();
			cabeca.getAnt().setProx(null);
			cabeca.setAnt(null);
			} else {
				cabeca = null;
				cauda = null;
			}
				tamanho--;

			return aux.getMusica();
		}

		private boolean isEmpty() {
			return cabeca == null;
		}

//adicionar na cauda/////////////////////////////////////////////////////////////////////////
		public void addCauda(Object musica) {
			Node novo = new Node(musica);

			if (isEmpty()) {
				cabeca = novo;
				cauda = novo;
			} else {
			novo.setAnt(cauda);
			cauda.setProx(novo);
			cauda = novo;
			}
			tamanho++;
		}

//Remover na cauda/////////////////////////////////////////////////////////////////////////
		public Object removerCauda() {
			if (isEmpty()) return null;

			Node aux = cauda;
			if(cauda.getAnt() != null) {
				cauda = cauda.getAnt();
				cauda.getProx().setAnt(null);
				cauda.setProx(null);
			} else {
				cabeca = null;
				cauda = null;
			}
				tamanho--;

			return aux.getMusica();
		}

//contem///////////////////////////////////////////////////////////////////////////////
		public boolean contem(Object musica) {
			for(Node n = cabeca; n!=null; n=n.getProx()) {
				if(n.getMusica().equals(musica)) {
					return true;
				}
			}
			return false;
		}
}


	
	

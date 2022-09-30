
public class Lista {
	private No inicio, fim;
	
	public void inserirInicio(int dado) {
		No aux = new No(dado);
				
		if(inicio == null) {			
			fim = aux;
		} else {
			aux.dir = inicio;
			inicio.esq = aux;			
		}
		inicio = aux;
	}
	
	public void inserirFim(int dado) {
		No aux = new No(dado);
				
		if(inicio == null) {
			inicio = aux;			
		} else {
			aux.esq = fim;
			fim.dir = aux;			
		}
		fim = aux;
	}

	public void inserir(int dado, int posicao) {
		No aux = new No(dado);
		
		int cont_posicao = 1;
		if (inicio == null && cont_posicao == 1) {
			inicio = aux;
			fim = aux;
		} else {
			No no_atual = inicio;
			while(no_atual != null) {
				No prox_no = no_atual.dir;
				if (prox_no == null && (cont_posicao + 1) == posicao) {
					no_atual.dir = aux;
					aux.esq = no_atual;
					fim = aux;
				}
				if (posicao == 1){
					no_atual.esq = aux;
					aux.dir = no_atual;
					inicio = aux;
				}
				if (cont_posicao == posicao) {
					if (no_atual != null) {
						No no_anterior = no_atual.esq;
						no_atual.esq = aux;
						no_anterior.dir = aux;
						aux.esq = no_anterior;
						aux.dir = no_atual;
						break;
					}
				} 
				no_atual = prox_no;
				cont_posicao += 1;
			}
			
		}
	}

	public Boolean verificar(){
		if (inicio != null){
			No aux = inicio;
			while (aux != null) {
				No aux2 = aux.dir;
				if (aux2 != null && aux2.dado < aux.dado){
					return false;
				}
				aux = aux2;
			}
		}
		return true;
	}
	
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}

	public No pesquisar(int dado) {
		No aux = inicio;
		while(aux != null) {
			if(aux.dado == dado) {
				break;
			}
			aux = aux.dir;
		}
		
		return aux;
	}

	public void remover(int dado) {
		No aux = pesquisar(dado);
		if(aux != null) { 
			if(inicio == aux && fim == aux) { // quando tiver apenas um nó
				inicio = null;
				fim = null;
				aux = null;
			} else if(aux == inicio) { // é o primeiro elemento
				inicio = aux.dir;
				inicio.esq = null;
				aux.dir = null;
				aux = null;
			} else if(aux == fim) { // é o último elemento
				fim = aux.esq;
				fim.dir = null;
				aux.esq = null;
				aux = null;
			} else { 
				aux.esq.dir = aux.dir;
				aux.dir.esq = aux.esq;
				aux.esq = null;
				aux.dir = null;
				aux = null;
				
			}
		}
	}

	public int size(){
		int size = 0;
		if (inicio == null){
			return 0;
		}
		else {
			No aux = inicio;
			while(aux != null){
				size += 1;
				aux = aux.dir;
			}
		}
		return size;
	}
	
}

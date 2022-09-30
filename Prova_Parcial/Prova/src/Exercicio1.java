
public class Exercicio1 {
	public static void main(String[] args) {

		Lista lista = new Lista();

		// inserção dos elementos
		lista.inserir(5, 1);
		lista.inserir(3, 2);
		lista.inserir(10, 1);
		lista.inserir(11, 3);
		
		// 5
		// 5,3
		// 10,5,3
		// 10,5,11,3
		
		// impressão dos elementos
		lista.imprimir();

	}
}

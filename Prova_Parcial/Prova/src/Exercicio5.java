
public class Exercicio5 {
	public static void main(String[] args) {

		// lista 1 para teste
		Lista lista1 = new Lista();
		lista1.inserirFim(10);
		lista1.inserirFim(20);
		lista1.inserirFim(30);
		lista1.inserirFim(40);
		System.out.println("tamanho da lista 1 --> " + lista1.size());

		// lista 2 para teste
		Lista lista2 = new Lista();
		lista2.inserirInicio(5);
		lista2.inserirFim(7);
		lista2.inserirInicio(30);		
		System.out.println("tamanho da lista 2 --> " + lista2.size());
		
		// lista 3 para teste
		Lista lista3 = new Lista();
		System.out.println("tamanho da lista 3 --> " + lista3.size());

	}
}

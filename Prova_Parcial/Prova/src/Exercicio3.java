
public class Exercicio3 {
	public static void main(String[] args) {

		// teste para a lista 1
		Lista lista1 = new Lista();
		lista1.inserirFim(1);
		lista1.inserirFim(2);
		lista1.inserirFim(3);
		lista1.inserirFim(4);

		System.out.println(lista1.verificar());

		// teste para a lista 2
		Lista lista2 = new Lista();
		lista2.inserirFim(10);
		lista2.inserirFim(2);
		lista2.inserirFim(1);
		lista2.inserirFim(412);

		System.out.println(lista2.verificar());

	}
}

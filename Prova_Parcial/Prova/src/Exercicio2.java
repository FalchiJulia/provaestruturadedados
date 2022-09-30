import java.util.Stack;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Stack<Integer> pilha1 = new Stack<Integer>();
		Stack<Integer> pilha2 = new Stack<Integer>();
		
		pilha1.push(1);
		pilha1.push(2);
		pilha1.push(3);

		pilha2.push(1);
		pilha2.push(3);
		pilha2.push(3);

		if(verificar(pilha1, pilha2)) {
			System.out.println("as pilhas são iguais");
		} else {
			System.out.println("as pilhas são diferentes");
		}
	}

	public static Boolean verificar(Stack<Integer> pilha1, Stack<Integer> pilha2){
		for (int i=0; i< pilha1.size(); i++){
			Integer elem1 = pilha1.get(i);
			Integer elem2 = pilha2.get(i);
			System.out.println(String.format("Pilha 1: [%s] | Pilha 2: [%s]", elem1, elem2));
			if (elem1 != elem2){
				return false;
			}
		}
		return true;
	}
}

import java.util.Stack;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<Integer>();
		pilha.push(10);
		pilha.push(20);
		pilha.push(5);
		pilha.push(60);
		
		imprimir(pilha);
		
		inverter(pilha);
		
		imprimir(pilha);

	}

	public static void imprimir(Stack<Integer> pilha){
		System.out.print("[");
		for (int i = 0; i < pilha.size(); i++) {
			if (i == pilha.size() - 1){
				System.out.print(pilha.get(i));
			}
			else {
				System.out.print(pilha.get(i) + ",");
			}
		}
		System.out.print("]");
		System.out.println();
	}

	public static void inverter(Stack<Integer> pilha){
		Integer[] aux = new Integer[pilha.size()];
		int contador = 0;
		for (int i = pilha.size(); i > 0; i--) {
			aux[contador] = pilha.get(i - 1);
			pilha.pop();
			contador += 1;
		}
		for (int j = 0; j < aux.length; j++) {
			pilha.push(aux[j]);
		}
	}
}

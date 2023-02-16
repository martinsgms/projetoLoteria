package loteria;

import java.util.Scanner;

public class LoteriaAuxiliar {

	private static final Scanner teclado = new Scanner(System.in);

	public static Loteria cadastrarLoteria() {

        System.out.println("=== PROGRAMA LOTERIA ===\n");
        
        System.out.print("Informe o nome da Loteria: ");
        String nome = teclado.next();

        System.out.print("Informe a quantidade de dezenas de " + nome + ": ");
        Integer quantidade_dezenas = teclado.nextInt();

        Loteria loteria = new Loteria();
        loteria.cadastrar(nome, quantidade_dezenas); //o atributo vai para a classe Loteria
        
        return loteria;
	}
}

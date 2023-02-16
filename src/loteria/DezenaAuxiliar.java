package loteria;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class DezenaAuxiliar {

	private static final Scanner teclado = new Scanner(System.in);

	public static void cadastrarDezenas(Loteria loteria) {
		System.out.print("\nInforme as dezenas possiveis a serem sorteada:\n");
		// Imput Dezenas cadastrar
		Set<Integer> dezenas = selecionarDezenas(loteria, false);

		List<Dezena> dezenasList = dezenas.stream().map(Dezena::new).collect(Collectors.toList());

		loteria.setDezenas(dezenasList);
	}

	public static Set<Integer> selecionarDezenas(Loteria loteria, boolean interromper) {
		Set<Integer> dezenas = new HashSet<>();

		for (int i = 0; i < loteria.getQuantidadeDezenas(); i++) {

			System.out.print("[dezena " + i + " de " + loteria.getQuantidadeDezenas() + "]: ");
			Integer numero = teclado.nextInt();

			boolean adicionado = dezenas.add(numero);

			while (!adicionado) {
				System.out.println("[ERRO] Número já cadastrado, tente novamente");
				numero = teclado.nextInt();
				adicionado = dezenas.add(numero);
			}

			if (interromper) {
				System.out.print("deseja finalizar sua escolha?\n1-Sim | 2-Não => ");
				Integer escolha = teclado.nextInt();

				if (escolha.equals(1)) {
					break;
				}

			}
		}
		return dezenas;
	}
}

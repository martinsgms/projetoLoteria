package loteria;

import java.util.Scanner;
import java.util.Set;

public class CombinacaoAuxiliar {

	private static final Scanner teclado = new Scanner(System.in);
	
	public static void realizarCombinacoes(Loteria loteria) {
		System.out.print("\nQuantas combinações você deseja? ");
        Integer quantidadeCombinacoes = teclado.nextInt();

        // =====================
        
        System.out.print("\nDeseja escolher dezenas para constar na combinação?\n1-Sim | 2-Não => ");
        Integer escolherDezenas = teclado.nextInt();

        Set<Integer> dezenasEscolhidasList = null;
        if (escolherDezenas.equals(1)) {
            dezenasEscolhidasList = DezenaAuxiliar.selecionarDezenas(loteria, true);
        }

        if (dezenasEscolhidasList != null && dezenasEscolhidasList.size() < loteria.getQuantidadeDezenas()) {


        }
        // =====================
        
        int[] dezenasLoteria = loteria.getDezenas().stream().map(Dezena::getNumero).mapToInt(Integer::intValue).toArray();
		
        Combinador.gerarCombinacoes(dezenasLoteria);
        
		Combinador.imprimirCombinacoes(quantidadeCombinacoes, dezenasEscolhidasList);
        
	}
    
}

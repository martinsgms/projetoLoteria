package loteria;

public class Principal {
	
	public static void main(String[] args) {

		Loteria loteria = LoteriaAuxiliar.cadastrarLoteria();
		
        DezenaAuxiliar.cadastrarDezenas(loteria);
        CombinacaoAuxiliar.realizarCombinacoes(loteria);
    }
}

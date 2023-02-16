package loteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Combinador {
	
	static List<List<Integer>> combinacoes = new ArrayList<>();

	public static void gerarCombinacoes(int[] array){  
        helper(array, 0);  
    }  
	
	public static void  imprimirCombinacoes(int limit, Set<Integer> dezenasEscolhidasList) {
		System.out.println("\nResultado:");
		
		if (dezenasEscolhidasList != null) {
			combinacoes.stream().limit(limit).filter(l -> l.containsAll(dezenasEscolhidasList)).forEach(System.out::println);
			return;
		}
		
		combinacoes.stream().limit(limit).forEach(System.out::println);
	}
  
    private static void helper(int[] array, int pos){  
        if(pos >= array.length - 1){   
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < array.length; i++){  
            	list.add(array[i]);
            }  
            combinacoes.add(list);
            return;  
        }  
  
        for(int i = pos; i < array.length; i++){   
          
            int t = array[pos];  
            array[pos] = array[i];  
            array[i] = t;  
  
            helper(array, pos+1);  
            
            t = array[pos];  
            array[pos] = array[i];  
            array[i] = t;  
        }  
    }  
    public static void main(String args[]) {  
        int[] numbers = {1, 9, 4, 3};  
        gerarCombinacoes(numbers);  
        
        combinacoes.stream().limit(3).forEach(System.out::println);
    }  
    
}
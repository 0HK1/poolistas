package listacarnaval8;

import java.util.HashMap;
import java.util.Map;

public class WorkHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> frequenciaPalavra= new HashMap<String, Integer>();
		
		String frase = "o tempo voa o tempo é relativo";
		
		String[] palavras = frase.split(" ");
		
		for(String palavra : palavras) {
			frequenciaPalavra.put(palavra, frequenciaPalavra.getOrDefault(palavra, 0) + 1);
		}
		System.out.println(frequenciaPalavra+"\n");
		
		for (Map.Entry<String, Integer> entrada : frequenciaPalavra.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
	}

}

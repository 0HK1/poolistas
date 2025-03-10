package listacarnaval7;

import java.util.ArrayList;

public class WorkArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> listaNomes = new ArrayList<String>();

			listaNomes.add("Ana");
			listaNomes.add("Bruno");
			listaNomes.add("Carlos");
			listaNomes.add("Daniela");
			
			System.out.println(listaNomes); 
			
			listaNomes.remove("Bruno");
			
			System.out.println(listaNomes); 
		
	}
	
}

package colection;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
	
		HashSet<String> setFrutas = new HashSet<String>();
		
		
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println(setFrutas);
		
		Iterator<String> iSetFrutas = setFrutas.iterator();
		
	
		while (iSetFrutas.hasNext()) {
			System.out.println(iSetFrutas.next());
		}
	}

}

package udemy_learning;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SetRunner {
	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','B','A','B','Z');
		
		Set<Character> treeset = new TreeSet<>(characters);
		System.out.println("TreeSet"+treeset);
		
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet"+linkedHashSet);
 	}
}
 
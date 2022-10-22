package method.reference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<String> fruites = new ArrayList<String>();
		fruites.add("Apple");
		fruites.add("Orange");
		fruites.add("Pine-Apple");
		fruites.add("Banana");
		fruites.add("Mango");

		System.out.println("=========================");
		System.out.println("Conventional loop");
		//Traditional
		for (String fruit : fruites) {
			System.out.println(fruit);
		}
		
		System.out.println("=========================");
		System.out.println("Use of Lambda Expression");
		fruites.forEach(
				//Use of Lambda Expression
				(fruit) -> System.out.println(fruit)
		);
		
		System.out.println("\nUse of Method References");
		System.out.println("=========================");
		//Use of Method References
		fruites.forEach(System.out::println);
	}
}

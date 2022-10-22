package lambda;
import java.util.Arrays;
import java.util.List;

public class ListManipulationsLambda {

	public static void main(String[] args) {
		
		//Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for(Integer n: list) {
		 System.out.println(n);
		}
		
		System.out.println("===============================");
		
		//New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list2.forEach(n -> System.out.println(n));
		
		System.out.println("===============================");
		
		//or we can use :: double colon operator in Java 8
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list3.forEach(System.out::println);

	}

}

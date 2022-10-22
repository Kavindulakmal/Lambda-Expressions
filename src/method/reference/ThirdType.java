package method.reference;

import java.util.Arrays;

public class ThirdType {

	public static void main(String[] args) {

		String[] stringArray = { "Sam", "Rock", "Ann", "Udara", "John", "Peter", "Yasho" };

		Arrays.sort(stringArray, String::compareToIgnoreCase);

		for (String str : stringArray) {
			System.out.print(str + ", ");
		}
	}
}

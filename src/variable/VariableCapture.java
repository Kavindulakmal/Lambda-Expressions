package variable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VariableCapture {

	public static void main(String[] args) {

		List<Integer> intSeq = Arrays.asList(10, 20, 30, 40, 50);
		intSeq.sort(Collections.reverseOrder());
		intSeq.forEach(x -> System.out.print(x + ", "));
	}
}

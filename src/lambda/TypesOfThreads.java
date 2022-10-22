package lambda;

import java.util.stream.IntStream;

public class TypesOfThreads {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print(i + ", ");
				}
			}
		};
		new Thread(r1).start();

		//Type 02
		new Thread(() -> IntStream.iterate(0, i -> i + 1).limit(10).forEach(i -> {
			System.out.print(i + ", ");
		})).start();

	}

}



















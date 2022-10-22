package lambda;

public class Ex1 {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("Thread Example1");
		new Thread(r).start();

	}

}

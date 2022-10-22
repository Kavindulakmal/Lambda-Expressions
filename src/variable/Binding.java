package variable;

public class Binding {

	public static void main(String[] args) {
		Binding binding = new Binding();
		binding.method();
	}

	void method() {
		int count = 16;
		Runnable r = () -> {System.out.println("count: " + count);};
		Thread t = new Thread(r);
		t.start();
	}
}

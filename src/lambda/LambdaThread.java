package lambda;

public class LambdaThread {

	public static void main(String[] args) {
		
		//Old way of creating Threads
		new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						System.out.println("Old way of creating Thread");
						
					}
				}).start();
		
		//New way using Lambda Expressions
		new Thread( () -> System.out.println("Lambda creating Thread")).start();

	}
}

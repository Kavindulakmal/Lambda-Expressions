package lambda;

interface ITest{
	void method();
	
	void m2();
}

public class NoParams {

	@FunctionalInterface
	interface ICommunicable{
		
		void sayHello();
		
		default void display(){
			System.out.println("Default method");
		}
		
		default void test(){
			System.out.println("Default test method");
		}
		
		static void displayName(){
			System.out.println("Static method");
		}
		
		static void displayStaticName(){
			System.out.println("Display Static method");
		}
	}
	
	public static void main(String[] args) {
		
		//Java Lambda Expression with no Parameters 
		ICommunicable iCommunicable = () -> System.out.println("Hello Udara !!!");
		iCommunicable.sayHello();
		iCommunicable.display();
		ICommunicable.displayName();
		
	}

}

package lambda;

interface ICommunicable2{
	
	void sayHello(String name);
	
	static void sayHello2(String name){
		System.out.println(name);
	}
}

public class OneParam {

	public static void main(String[] args) {
		
		//Java Lambda Expression with one Parameters 
		ICommunicable2 iCommunicable2 = (name) -> System.out.println("Hello " + name + " !!!");
		iCommunicable2.sayHello("Udara");
		ICommunicable2.sayHello2("static");
	}
}

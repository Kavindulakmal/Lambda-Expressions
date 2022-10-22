package method.reference;


public class First {
	
	interface IReference {
		void myMethod();
	}
	public First() {
		System.out.println("First default constructor");
	}
	public void myMethod() {
		System.out.println("Instance Method");
	}
	public static void main(String[] args) {
		First first = new First();
		IReference iReference = first::myMethod;
		iReference.myMethod();
	}
}

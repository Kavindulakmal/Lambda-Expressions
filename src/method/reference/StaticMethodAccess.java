package method.reference;

public class StaticMethodAccess {
	interface IMethodRef {
		void ref();
	}
	
	public StaticMethodAccess() {
		System.out.println("Default Constructor");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method display");
	}

	public static void main(String[] args) {
		IMethodRef iReference = StaticMethodAccess::staticMethod;
		iReference.ref();
	}
}

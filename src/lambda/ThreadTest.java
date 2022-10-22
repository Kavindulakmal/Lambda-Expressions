package lambda;

class Person{
	public void displayPerson(){
		System.out.println("Person");
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		Person person = new Person() {

			public void displayPerson(){
				System.out.println("Override Person");
			}
		};
		person.displayPerson();

	}

}

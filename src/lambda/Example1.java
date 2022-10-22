package lambda;
interface IAddService{
	
	int add(int no1, int no2);
}

interface IDisplayService{
	
	String showMessage(String message);
}


public class Example1 {

	public static void main(String[] args) {
		
        IAddService iAddService = (int x, int y) -> (x + y);
        
        System.out.println(iAddService.add(123, 456));
		
        IDisplayService iDisplayService = message -> (message);
        IDisplayService iDisplayService2 = message -> {System.out.println(message); return message;};
        IDisplayService iDisplayService3 = message -> {System.out.println(iAddService.add(123, 456)); return message;};
        System.out.println(iDisplayService.showMessage("Hello SLIIT"));
        
        System.out.println(iDisplayService2.showMessage("Hello SLIIT"));
        
        System.out.println(iDisplayService3.showMessage("Hello SLIIT"));
        
        IDisplayService iDisplayService4 = message -> (Integer.toString(iAddService.add(123, 456)));
        System.out.println(iDisplayService4.showMessage("Hello SLIIT"));
        

	}

}

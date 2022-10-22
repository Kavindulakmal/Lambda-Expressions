package method.reference;

@FunctionalInterface 
interface IFoodService{  
    void display();  
}  

class Food{  
    public Food(){  
        System.out.println("Food Constructor");  
    }  
} 

public class Constructor {

	public static void main(String[] args) {
        IFoodService iFoodService = Food::new;  
        iFoodService.display();
	}
}

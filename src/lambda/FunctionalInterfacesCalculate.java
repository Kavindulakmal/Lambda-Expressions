package lambda;

@FunctionalInterface
interface ICalcculater{
	
	int add(int no1, int no2);
	
	default int min(int no1, int no2){
		return (no1 - no2);
	}
	
	default int mul(int no1, int no2){
		return (no1 * no2);
	}
	
	default double div(int no1, int no2){
		return (no1 / no2);
	}
}

public class FunctionalInterfacesCalculate {

	public static void main(String[] args) {
		
		ICalcculater iCalcculater = (x, y) -> (x + y);
		
		System.out.println(iCalcculater.add(100, 200));
	}
}

//System.out.println(iCalcculater.min(100, 200));
//System.out.println(iCalcculater.mul(100, 200));
//System.out.println(iCalcculater.min(100, 200));
//System.out.println(iCalcculater.div(100, 200));
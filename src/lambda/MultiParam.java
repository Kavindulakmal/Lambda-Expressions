package lambda;

interface IConcaternate{
	
	void concat(String branch, String institute);
}

public class MultiParam {

	public static void main(String[] args) {
		
		//Java Lambda Expression with no Parameters 
		IConcaternate iConcaternate = (branch, institute) -> System.out.println(branch + institute);
		iConcaternate.concat("Malabe ", "SLIIT");
	}
}

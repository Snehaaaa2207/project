package thirtyjavaprogram;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		boolean citizen = true;
		if(age >= 18) {
			if(citizen) {
				System.out.println("Eligible to vote");
			}else {
				System.out.println("Not a Citizen");
			}
				
			
		}else {
			System.out.println("Under Age");
		}

	}

}

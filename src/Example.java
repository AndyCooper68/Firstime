import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Provid a number");
	 int number = scanner.nextInt();
	 
	 boolean isPrimary = isPrimary(number);
	 
	 System.out.println(isPrimary);
	 
	 
	}

	private static boolean isPrimary(int number) {
		boolean isThereRemainder = true ;
		
		int divider = 2;
		while((( number % divider !=0) && divider++ < number)){
			return divider == number;
			
			
			
			
			
			
		}
		
		return isThereRemainder;
		
	}

}

import java.util.Random;

public class ifStatements {

	public static void main(String[] args) {
		
		// if statement = performs a block of code if it's condition evaluates to be true
		
        Random random = new Random();
		
		int x = random.nextInt(100)+1;

        System.out.println(x);

		// int age = 75;
		
		if(x>=75) {
			System.out.println("Ok Boomer!");
		}
		else if(x>=18) {
			System.out.println("You are an adult!");
		}
		else if(x>=13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are not an adult!");
		}
				
	}
}
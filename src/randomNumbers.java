import java.util.Random;

public class randomNumbers {
    
    public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;
        random.nextInt();
        // random.nextDouble()
        // random.nextBoolean()
		//double y = random.nextDouble();
		//boolean z = random.nextBoolean();
		
		System.out.println(x);
				
	}
}

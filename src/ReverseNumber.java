import java.util.Scanner;


public class ReverseNumber {
	
	static Scanner kb = new Scanner(System.in);
	static int input;
	
	
	public static void main(String[] args) {
		System.out.print("Please provide an integer: ");
		int userNum = kb.nextInt(); 
						
		while (userNum == 0) {
			System.out.print("Please select a non-zero integer: ");
			input = kb.nextInt();
		}
		
		int flipped = flipInt(userNum);
		System.out.println(flipped);
		
	}	
		
	public static int flipInt(int input){
		boolean neg = false;
		int result = 0;
		
		if (input < 0){
			neg = true;
			input = Math.abs(input);
		}
	
		while (input != 0){
			
			result = (result*10) + (input%10);
			input = input/10; 
			
		}
				
		if (neg){
			result = 0 - result; 
		}
		
		kb.close();
		return result; 
	}
}

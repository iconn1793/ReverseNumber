import java.util.Scanner;


public class ReverseNumber {
	
	static Scanner kb = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("Please provide an integer: ");
		int userNum = kb.nextInt(); 
						
		while (userNum == 0) {
			System.out.print("Please select a non-zero integer: ");
			userNum = kb.nextInt();
		}
		
		int flipped = flipInt(userNum);
		System.out.println(flipped);
		
	}	
		
	public static int flipInt(int input){
		int result = 0;

		while (input != 0){
			
			result = (result*10) + (input%10);
			input = input/10; 
			
		}
			
		kb.close();
		return result; 
	}
}

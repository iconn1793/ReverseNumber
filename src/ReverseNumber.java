import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Please provide an integer: ");
		int input = kb.nextInt(); 
				
		while (input == 0) {
			System.out.print("Please select a non-zero integer: ");
			input = kb.nextInt();
		}
		
		if (input < 0){
			input = Math.abs(input);
			System.out.print("-");
		}
		
		String inputString = Integer.toString(input);
		int n = inputString.length();
		
		for (int i = 0; i < n; i++){
			
			int tmp = input%10; 
			input = (input - tmp)/10;
			System.out.print(tmp);
			
		}
		
		System.out.println();
		kb.close();
	}

}

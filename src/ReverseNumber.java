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
		int newInt = 0;
		boolean neg = false;
		
		if (input < 0){
			neg = true;
		}
		
		input = Math.abs(input);
		
		String inputString = Integer.toString(input);
		int n = inputString.length();
		int[] reversedNum = new int[n];
		
		//creates reversed digit array
		for (int i = 0; i < n; i++){
			
			int tmp = input%10; 
			input = (input - tmp)/10;
			reversedNum[i] = tmp;
			
		}
		
		//creates new/composited int
		for (int k = 0; k < n; k++){
			//
			int tmp = (int) (Math.pow(10,((n-1)-k)) * reversedNum[k]);
			newInt = newInt + tmp;
		}
		
		if (neg){
			newInt = newInt - (newInt*2);
		}
		
		kb.close();
		return newInt; 
	}

}

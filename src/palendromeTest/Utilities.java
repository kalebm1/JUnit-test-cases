package palendromeTest;

public class Utilities {
	
	//Method to return a boolean, true if the input is a palendrome, false if it is not.
	public static boolean isPalendrome(String input) {
		input = input.replaceAll("\\s+", "").toLowerCase();
		if(input.length() <= 1)
			return true;
		else if(input.charAt(0)==input.charAt(input.length()-1)) {
			return isPalendrome(input.substring(1,input.length()-1));
		}
		else
			return false;
	}
	
	
	//Method to sort an array of ints using Bubble Sort.
	public static void BubbleSort(int[] array) {
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	
	//Method to return the factorial of an int.
	public static long factorial(int num) {
		if(num<=1)
			return 1;
		
		return num*factorial(num-1);
	}
}

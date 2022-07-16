package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	
		String arr1 ="madam";
		String rev ="";
		
		char[] arr2= arr1.toCharArray();
		
		for (int i = arr2.length-1; i >=0; i--) {
			
			rev =rev+ arr2[i];
		}
		
		if (rev.equals(arr1))
		{
			System.out.println("It is a palindrome");

		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}

package week1.day2;

public class ReverseEvenWord {

	public static void main(String[] args) {
	
		String str ="I am a software tester";
		String[] arr = str.split(" ");
		for (int i = 0; i <=arr.length-1; i++) 
		{
			if (i%2!=0)
		{
			char[] arr1 = arr[i].toCharArray();	
			for (int j = arr1.length-1; j >=0; j--) {
				System.out.print(arr1[j]);
			}
			
			System.out.print(" ");
		}
			else
			{
				char[] arr2=arr[i].toCharArray();
				{
					for (int k = 0; k <arr2.length; k++) {
						System.out.print(arr2[k]);
					}
					System.out.print(" ");
				}
			}
				
		}	
	}	
	}	

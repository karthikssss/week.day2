package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		int count =0 ;
		
		String[] arr= text.split(" ");
	
		for (int i = 0; i<=arr.length-1; i++) {
			for (int j = i+1; j<=arr.length-1; j++) {
				{
					if (arr[i].equalsIgnoreCase(arr[j]))
					{
						count=count++;
						arr[j]="";
					}
				}
			
			}
		}
		for (int k = 0; k<=arr.length-1 ;k++) {
			
			System.out.print(arr[k]+" ");
			
		}
			
		}
	}

					
					
	

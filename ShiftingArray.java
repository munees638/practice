
package payilagamPractices;

import java.util.Scanner;

public class ShiftingArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6}; 
		
		boolean run = true;
		
		while(run) {
			
			String[] type = {"Type 1 - Right Shift Once", "Type 2 - Left Shift Once", "Type 3 - Right Shift Twice", "Type 4 - Left Shift Twice", "Type 5 - for exit"}; 
			
			for(String i : type) {
				
				System.out.println(i);
			}			
			System.out.println();
			
			int ans = in.nextInt();
			
			switch(ans) {
			
			case 1:rightShiftOnce(arr);
				   break;
				   
			case 2:leftShiftOnce(arr);
			       break;
			   
			case 3:rightShiftTwice(arr);
			   	   break;
			   	   
			case 4:LeftShiftTwice(arr);
			       break;
			       
			default: run = false;
			         System.out.println("Program End");
				
			}
			
			if(ans <=4) {
				
				for(int j=0;j<arr.length;j++) {
					
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
			
			System.out.println();
		}
		
	}
	
	static void LeftShiftTwice(int[] arr) {
		
		leftShiftOnce(arr);
		
		leftShiftOnce(arr);
	}
	
	static void rightShiftTwice(int[] arr) {
	
		rightShiftOnce(arr);
		
		rightShiftOnce(arr);
	}
	
	static void leftShiftOnce(int[] arr) {
		
		int temp = arr[0];
		
		int i = 0, k = 1;
		
		while(k < arr.length) {
			
			arr[i++] = arr[k++];
		}
		arr[i] = temp;
		
	}
	
	static void rightShiftOnce(int[] arr) {
	
		int temp = arr[arr.length - 1];
		
		int i = arr.length - 1, k = arr.length - 2;
		
		while(k >= 0) {
			
			arr[i--] = arr[k--];
		}
		arr[0] = temp;
		
	}	
}

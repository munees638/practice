package dsa;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		
		int[] arr = {2,3,1,4,5};
		
		cyclicSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	static void cyclicSort(int[] arr) {
		
		int i=0;
		
		while(i<arr.length) {
			
			int correct = arr[i] - 1;
			
			if(arr[i] != arr[correct]) {
				
				arr[i] = arr[correct] + arr[i] - (arr[correct] = arr[i]);
			}
			else {
				
				i++;
			}
		}
	}
}

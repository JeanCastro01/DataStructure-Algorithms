package Algorithms;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array Before Bubble Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("  ");
		System.out.println("  ");
		

		bubbleSort2(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void bubbleSort(int[] arr) {
		
		
		int n = arr.length;
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 1; j < (n - i); j++) {
				
				if (arr[j - 1] > arr[j]) {
					
					// swap elements
					
					temp = arr[j - 1];
					
					arr[j - 1] = arr[j];
					
					arr[j] = temp;
				}

			}
		}

	}
	
	static void bubbleSort2(int[] arr) {
		
		
			int n = arr.length;
			int temp = 0;
   
				for ( int i = 0; i < n; i++) {
    	
    	
				for ( int j = 1; j < (n - i); j ++) {
    		
    		
					if (arr[j -1] > arr[j]) {
    			
						temp = arr[j -1];
    			 
						arr[j -1] = arr[j];
    			 
						arr[j] = temp;
    			
    			
    		}
    		
 	
    	}
    	
	
    	
    }
   
   
}
}

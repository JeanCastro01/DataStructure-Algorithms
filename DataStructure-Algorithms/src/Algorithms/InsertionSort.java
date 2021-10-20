package Algorithms;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		
		for (int firstUnsortedindex =1; firstUnsortedindex < intArray.length; firstUnsortedindex ++) {
			
			
			
			int newElement = intArray[firstUnsortedindex];
			
			int i;
			
			for ( i = firstUnsortedindex ; i > 0 && intArray[i-1] > newElement; i -- ) {
				
				
			intArray[i] = intArray[i-1];	
				
			}
           		
			intArray[i] = newElement;
			
			
		}
		 
		for ( int i = 0; i < intArray.length; i ++) {
			
			
			System.out.println(intArray[i]);
		}
		
		
		

	}

}

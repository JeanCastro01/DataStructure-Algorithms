package Algorithms;

public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Updated
		
		
		int[] intArray = new int [7];
		
		
		
		intArray[0] = 20;
		intArray[1] = 20;
		intArray[2] = 20;
		intArray[3] = 20;
		intArray[4] = 22;
		intArray[5] = 20;
		intArray[6] = 20;
		
	
		int index = -1;
		
		for ( int i = 0; i < intArray.length; i ++) {
			
			if ( intArray[i] == 22) {
				
				
				index = i;
				break;
				
			}
		}
		
		System.out.println("index = " + index);;
		
		
		 

	}

}

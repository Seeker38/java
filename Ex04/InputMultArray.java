import java.util.Scanner;

public class InputMultArray {

	public static void inputArray(int array[][]){ 
		Scanner scan = new Scanner(System.in);
		// loop through array's rows                                     
        for ( int row = 0; row < array.length; row++){
			System.out.printf("Values of the row %d: \n", row);		
			// loop through columns of current row                        
			for ( int column = 0; column < array[row].length; column++ ){
				array[row][column] = scan.nextInt();	
            }
		}	              
		 
	}
	
	public static void outputArray(int array[][]){ 
	
        // loop through array's rows                                     
        for ( int row = 0; row < array.length; row++){
			// loop through columns of current row                        
			for ( int column = 0; column < array[row].length; column++ )
				System.out.printf("%5d  ", array[row][column]);       
                                                                         
			System.out.println(); // start new line of output             
        }                                              

	}

	public static int[][] sumArrays(int array1[][], int array2[][]){
		
		int[][] sum = new int[array1.length][array1[0].length];
		
		for (int row = 0; row < sum.length; row++) {
			for (int column = 0; column < sum[row].length; column++)
				sum[row][column] = array1[row][column] + array2[row][column];
		} 

		return sum;	
	}
	
	public static void main(String[] arguments) {
	
		if(arguments.length != 2){
			System.out.println("Usage: java InputMultArray <rows> <columns>");
		}
		
		int rows = Integer.parseInt(arguments[0]);
		int columns = Integer.parseInt(arguments[1]);
		
		int[][] array1 = new int[rows][columns];  
		int[][] array2 = new int[rows][columns];  
		
		System.out.println("\nEnter values for the first array:\n");
		inputArray(array1);
		
		System.out.println("\nEnter values for the second array:\n");
		inputArray(array2);
	
		System.out.println("");
		outputArray(array1);

		System.out.println("+");
		outputArray(array2);

		System.out.println("=");
		outputArray(sumArrays(array1, array2));
		
	}
}

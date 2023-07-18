import java.util.InputMismatchException;
import java.util.Scanner;
 
public class DivideByZeroWithExceptionHandling {
    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient( int numerator, int denominator ) throws ArithmeticException    
	{
        return numerator / denominator; // possible division by zero
    } 

    public static void main( String args[] ) {
        Scanner scanner = new Scanner( System.in ); // scanner for input
        boolean continueLoop = true; // determines if more input is needed
        do {		
		   try {
			  // read two numbers and calculate quotient                 
              System.out.print( "Nhap so bi chia nguyen: " );    
              int numerator = scanner.nextInt(); 			  
              System.out.print( "Nhap so chia nguyen: " );  
              int denominator = scanner.nextInt();	  
              
			  int result = quotient( numerator, denominator );
			  System.out.printf( "\nKet qua: %d / %d = %d\n", numerator, denominator, result );				 
              continueLoop = false; // input successful; end looping        
           } 
		   catch(InputMismatchException inputMismatchException) {                  
				System.err.printf( "\nNgoai le: %s\n",
					inputMismatchException );				 
				scanner.nextLine(); // discard input so user can try again    
				System.out.println(            
                 "Du lieu khong hop le. Xin moi nhap lai so nguyen.\n" );          
           } 
		   catch ( ArithmeticException arithmeticException ) { 	 
				System.err.printf( "\nNgoai le: %s\n", 		
									arithmeticException );
              System.out.println(                         
                 "So chia phai khac 0. Xin moi nhap lai.\n" );   
           }                                                     
        } while ( continueLoop ); 
     } 
  }  

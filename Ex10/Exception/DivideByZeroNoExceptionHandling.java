import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator){
        return numerator / denominator; // possible division by zero
    } // end method quotient
 
    public static void main( String args[] ){
        Scanner scanner = new Scanner( System.in ); // scanner for input
        System.out.print( "Nhap so bi chia nguyen: " );
        int numerator = scanner.nextInt();
        System.out.print( "Nhap so chia nguyen: " );
        int denominator = scanner.nextInt();
        int result = quotient( numerator, denominator );
        System.out.printf("\nKet qua: %d / %d = %d\n", numerator, denominator, result );
    } // end main
} // end class DivideByZeroNoExceptionHandling

import java.util.Scanner;

class SuperPrime{

    public static boolean isPrime(int k){
        if (k <= 1)
            return false;
        else if ( k == 2)
            return true;
        else if ( k % 2 == 0)
            return false;
        for (int i = 3; i < k/2 ; i+=2){
            if ( k % i == 0)
            return false;
        }
        return true;
    }
        
    public static boolean is_Superprime(int n){
        if (isPrime(n) == true && n < 10)
            
            return true;        
        else {

            return (isPrime(n) == true && isPrime(n/10) == true);

        }
    }

    public static void main(String[] args) {
        
        Scanner ip= new Scanner(System.in);

        int n = ip.nextInt();

        if (is_Superprime(n))
            System.out.print("True");
        else
        {   
            System.out.println("False");

        }
    }

}
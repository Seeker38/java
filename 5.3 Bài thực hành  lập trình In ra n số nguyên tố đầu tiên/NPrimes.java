import java.util.Scanner;
public class NPrimes
{
    public static void print(int n)
    { 
	int i=1;
	int a=0;
	while ( a<=n )
	{
		i+=1;
		int s=0;
		for (int x=2; x<i; x++)
		{
			if ( i%x==0 )
			{
				s+=1;
			}
		}
		if ( s==0 )
		{
			a+=1;
			System.out.print(i +" ");
		}
	}
    }
    public static void main (String args[])
    {
    	Scanner scan = new Scanner(System.in);
	System.out.print("\nNhap gia tri cua n: ");
	int n =scan.nextInt(); 
	print(n);
    }
}
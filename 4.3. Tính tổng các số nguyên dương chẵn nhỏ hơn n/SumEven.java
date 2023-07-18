public class SumEven{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);	
		int Sum = SumOfEven(n);
		System.out.println(Sum);
	}
	
	public static int SumOfEven( int n ){
		int i;
		int Sum = 0;
		for (i = 0; i < n; i = i + 2){
			Sum = Sum + i;
		}
		return Sum;
	}

}
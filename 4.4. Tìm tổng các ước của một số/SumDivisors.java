public class SumDivisors{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int Sum = getSumDivisors(n);
		System.out.println(Sum);

	}
	
	public static int getSumDivisors(int n){
		int i;
		int Sum = 0;
		for (i = 1; i <= n; i++){
			if (n%i == 0){
				Sum = Sum + i;
			}
		}
		return Sum;
	}
}
public class Exp{

	public static double calExp(double x, int n){
		double ans = 0;
		double c = 1;
		
		for (int i =1; 1<= n+1; i++){
			ans += c;
			c = c * x/i; 

		}
		return Math.round(ans * 100.0)/100.0;

	}

	public static void main(string[] args){
		double x = double.parseDouble(args[0]);
		int n = Integer.parseInt(args[1]);
		System.out.println(calExp(x, n));


	}

}

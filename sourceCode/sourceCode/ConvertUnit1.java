public class ConvertUnit1{

	public static void main(String[] args){
		
		double x = Double.parseDouble(args[0]);
		double y = 39.3700787 *x;
		y = Math.round(y *100.0) / 100.0; 		
  
		System.out.println(y);

	}
}
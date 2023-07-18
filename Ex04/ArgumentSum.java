public class ArgumentSum {
  public static void main(String[] arguments) {
	
	int[] values = new int[arguments.length];  
	
	int sum = 0;
	
	for(int i=0; i<values.length; i++) {
		values[i] = Integer.parseInt(arguments[i]);
		sum += values[i];
	}	
		
	System.out.println("Sum of the arguments is " + sum);
  }
}
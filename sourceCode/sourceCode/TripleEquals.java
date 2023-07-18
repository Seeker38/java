public class StringEqual {

	public static void main( String[] args){

		String parameter1 = args[0];
		String parameter2 = args[1];
		String parameter3 = args[2];
		Boolean result;

		result = parameter1.equals(parameter2) && parameter2.equals(parameter3);

		System.out.println(result);

	}
}
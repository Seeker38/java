public class ModifyArray {
	public static void modifyArray(int array[]){ 
		for(int i=0; i < array.length; i++) 
			array[i] *= 2;  
		//for(int number:array)
			//number *= 2; 
	}
	
	public static void modifyElem(int elem){
		elem *=2;
	}
	
	public static void main(String[] arguments) {
	
		int[] values = new int[arguments.length];  
		int sum = 0;
	
		for(int i=0; i < values.length; i++) {
			values[i] = Integer.parseInt(arguments[i]);
		}
		
		System.out.println("Array elements:");
			
		for(int i=0; i < values.length; i++) {
			System.out.print("\t" + values[i]);
		}		
		
		System.out.print("\n");
	
		modifyArray(values);
		System.out.println("Array elements (modifyArray):");
		for(int i=0; i < values.length; i++) {
			System.out.print("\t" + values[i]);
		}
		System.out.print("\n");
		
		for(int i=0; i < values.length; i++) {
			modifyElem(values[i]);
		}
		
		System.out.println("Array elements (modifyElem):");

		for(int i=0; i < values.length; i++) {
			System.out.print("\t" + values[i]);
		}
		
		System.out.print("\n");
		

		sum = 0;
		for(int number:values)
			sum += number;
		
		modifyElem(sum);
		
		System.out.println("Sum of arguments * 2 is " + sum);

	}
}

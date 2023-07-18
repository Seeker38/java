public class NumberProps{

	public static boolean isPrime(int k){
		if (k <= 2){
			return false;
		} else{
			for(int i = 2; i < k; i++){
				if(k%i == 0){
					return false;
				}
			}
			return true;
		}	
		
	}
		    
	public static void main(String[] args){    
		int k = Integer.parseInt(args[0]);
		boolean prime = isPrime(k);    		
		System.out.println(prime);

	}    
}

class NPerfects
{
        static boolean isPerfect(int n)
    {
        //begin edit
		int k;
		for (int i=1; i<n; i++){
			if (n%i == 0){
				k+=i;
			}
		}
		if (n == k){
			return true;
		} else {
			return false;
		}
        //end edit        
    }
        
    static void printNPerfect(int n)
    {
		
		for (int i=1; i<n; i++){
			if (isPerfect(i)){
				System.out.print(i + " ");
			}

		}
		


    }
    public static void main (String args[])
    {
		int n = Integer.parseInt(args[0]);
		printNPerfect(n);
	
    }
}
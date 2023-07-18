class RightTriangle
{
    
    static boolean isTriangle(double a, double b, double c)
    {
        // begin edit 	
	
       if (a + b > c && b + c > a && c + a > b && a > 0 && b > 0 && c > 0){
		return true;
	   } 
	  else {
		return false;
	   } 
	  

        //end edit
    }
    public static void main (String[] args)
    {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		boolean result = isTriangle(a,b,c);
		System.out.println(result);
    }
}
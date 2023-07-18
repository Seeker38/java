class Triangle
{
    static double getArea(double a, double b, double c)
    {
		double perimeter = (a + b + c)/2;
		double acreage = Math.sqrt(perimeter*(perimeter - a)*(perimeter - b)*(perimeter - c));
		if (a <= 0 || b <= 0 || c <= 0){
			return acreage = 0;
		} else if ( a + b > c && b + c > a && c + a > b ){
			acreage = acreage;
			return acreage;
       	} else {
			return acreage = 0;
		}
    }
    public static void main(String[] args)
    {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double acreage = getArea(a,b,c);
		System.out.println(acreage);        
    }
}
public class Distance {

	public static void main(String[] args){
		
		double x1 = Double.parseDouble(args[0]);
		double x2 = Double.parseDouble(args[2]);
		double y1 = Double.parseDouble(args[1]);
		double y2 = Double.parseDouble(args[3]);
		double Distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		Distance = Math.round(Distance * 100.0)/100.0;
		System.out.println(Distance);

	}
}
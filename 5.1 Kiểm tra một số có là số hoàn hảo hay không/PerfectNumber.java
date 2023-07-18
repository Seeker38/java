//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong
class PerfectNumber
{
    public static boolean isPerfect(int n)
    {
        // begin edit
		int k = 0;
		for (int i=1; i<n; i++){
			if (n%i ==0 ){
				k = k + i;
			} else if (k == n){
				return true; 						
			} else {
				return false;
			}
		}
		return false;
        //end edit  
    }
    public static void main(String []args)
    {
		int n = Integer.parseInt(args[0]);
		boolean result = isPerfect(n);
		System.out.println(result);
		
    }
    
}
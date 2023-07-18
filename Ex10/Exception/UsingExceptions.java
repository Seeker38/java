public class UsingExceptions {
    public static void main( String args[] ) {
        try {
           throwException();
        } catch ( Exception exception ){
           System.err.println( "Exception handled in main" );
        } // end catch
    } // end main

    public static void throwException() throws Exception {
        try { 
           System.out.println("Method throwException" );
           throw new Exception();
        }catch (RuntimeException runtimeException){
           System.err.println(
              "Exception handled in method throwException" );
        } // end catch
        finally{
           System.err.println( "Finally is always executed" );
        } // end finally
    } // end method throwException
} // end class UsingExceptions
/* 
Cac van de dat ra:
- Nem ngoai le ma khong bat dung ngoai le (catch) hoac nem tiep di (throws)
- Bat dung kieu ngoai le duoc nem
*/
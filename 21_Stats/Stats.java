public class Stats {

    public static int mean(int a, int b) {
      return ((a + b) / 2);

  }
 
    public static double mean(double a, double b) {
        return ((a + b) / 2.0);
  }

    public static int max(int a, int b) {
        if (a == b) {
            return a;
        }   else if (a > b) {
            return a;
        }   else{
            return b;
        }
  }
 
    public static double max(double a, double b) {
          if (a == b) {
            return a;
        }   else if (a > b) {
            return a;
        }   else{
            return b;
        }
  }
   
  
    public static double geoMean(double a, double b) {
        return Math.sqrt(a * b);
  }
   
    public static int max(int a, int b, int c) {
        return (Math.max(a, Math.max(b, c)));
  }
 
    public static double max(double a, double b, double c) {
        return (Math.max(a, Math.max(b, c)));
  }
    public static double geoMean(double a, double b, double c) {
	return Math.cbrt(a * b *c);
  }

    public static void main(String args[]){
	System.out.println(mean(10, 20));
	System.out.println(mean(10.0, 20.0));
	System.out.println(max(5, 10));
	System.out.println(max(5.0, 10.0));
	System.out.println(geoMean(10, 40));
	System.out.println(max(5, 10, 15));
	System.out.println(max(5.0, 10.0, 15.0));
	System.out.println(geoMean(10.0, 40.0, 4.0));
}
}

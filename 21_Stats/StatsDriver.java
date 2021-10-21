public class StatsDriver {

        public static void main(String[] args) {
                Stats Tester = new Stats();
                int a = 10;
                int b = 100;
                int c = 216;
                double a2 = 10.0;
                double b2 = 100.0;
                double c2 = 216.0;
                
                
                int meanOutput=Tester.mean(a, b);
                double doublemeanOutput=Tester.mean(a2, b2);
                int maxOutput=Tester.max(a, b);
                double doublemaxOutput=Tester.max(a2, b2);
                int geomeanOutput=Tester.geoMean(a, b);
                double doublegeomeanOutput=Tester.geoMean(a2, b2);
                int threevaluemaxOutput=Tester.max(a, b, c);
                double doublethreevaluemaxOutput=Tester.max(a2, b2, c2);
                int threevaluegeomeanOutput=Tester.geoMean(a, b, c);
                double doublethreevaluegeomeanOutput=Tester.geoMean(a2, b2, c2);
                System.out.println("Correct Output: 55   Actual Output: " + meanOutput);
                System.out.println("Correct Output: 55.0   Actual Output: " + doublemeanOutput);
                System.out.println("Correct Output: 100    Actual Output: " + maxOutput);
                System.out.println("Correct Output: 100.0   Actual Output: " + doublemaxOutput);
                System.out.println("Correct Output: 31    Actual Output: " + geomeanOutput);
                System.out.println("Correct Output: 31.62227766...   Actual Output: " + doublegeomeanOutput);
                System.out.println("Correct Output: 216   Actual Output: " + threevaluemaxOutput);
                System.out.println("Correct Output: 216.0    Actual Output: " + doublethreevaluemaxOutput);
                System.out.println("Correct Output: 60   Actual Output: " + threevaluegeomeanOutput);
                System.out.println("Correct Output: 60.0   Actual Output: " + doublethreevaluegeomeanOutput);
        }
}
  
 
   
    

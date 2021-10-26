
public class Driver {

  public static void main( String[] args ) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        int x = 20;
        int y = 30;
        int matchCounter = 0;
        
        while (coin1.getHeadsCtr() + coin2.getHeadsCtr() != x){
            coin1.flip();
            coin2.flip();
        }
        System.out.println("Desired Heads: 20" + "\nNumber of Heads: " + (coin1.getHeadsCtr() + coin2.getHeadsCtr()) +
        "\nHeads from Coin1: " + coin1.getHeadsCtr() + "\nHeads from Coin2: " + coin2.getHeadsCtr());
        
        while (matchCounter != y) {
            coin1.flip();
            coin2.flip();
            if (coin1.equals(coin2)) {
                matchCounter ++;
            }
        }
            System.out.println("-------------------" + "\nIt took " + coin1.getFlipCtr() + " flips to get " + y + " matches.");
            matchCounter = 0;
            coin1.reset("dollar", 0.5);
            coin2.reset("dollar", 0.5);
            
           
        
        
        while (matchCounter < 65536 || (matchCounter % 2005 != 0)) {
            coin1.flip();
            coin2.flip();
            if (coin1.equals(coin2)) {
                matchCounter ++;
            }
        }
        System.out.println("-------------------" + "\nIt took " + coin1.getFlipCtr() + 
        " flips to get a match number greater than 65536 and evenly divisible by 2005.");
  }
}

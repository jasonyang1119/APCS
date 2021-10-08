public class Greet{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib("Word up");
    		greeting = richard.greet("freshman");
    		System.out.println(greeting);
		
		BigSib grizz = new BigSib("Salutations");
		greeting = grizz.greet("Dr. Spaceman");
		System.out.println(greeting);


		BigSib dotCom = new BigSib("Hey ya");
		greeting = dotCom.greet("Kong Fooey");
		System.out.println(greeting);

		BigSib tracy = new BigSib("sup");
		greeting = tracy.greet("mom");
		System.out.println(greeting);
  	} 
} 
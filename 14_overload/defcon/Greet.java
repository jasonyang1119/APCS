/*
Jason Yang/Bob , Lindsay Phung/Terry , Parl Serbanescu
APCS
HW14: Customize Your Creation
2021-10-07
*/

/*
DISCO: Constructors can act on variables when they are created.
QCC: Why exactly do we need public BigSib() when the code worked perfectly fine before?
*/



public class Greet{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib();
    		greeting = richard.greet("freshman");
    		System.out.println(greeting);
		
		BigSib grizz = new BigSib();
		greeting = grizz.greet("Dr. Spaceman");
		System.out.println(greeting);


		BigSib dotCom = new BigSib();
		greeting = dotCom.greet("Kong Fooey");
		System.out.println(greeting);

		BigSib tracy = new BigSib();
		greeting = tracy.greet("mom");
		System.out.println(greeting);
  	} 
} 

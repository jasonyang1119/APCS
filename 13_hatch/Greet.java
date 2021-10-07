/*
BJLT (Jason Yang, Lindsay Phung, Bob, Terry)
APCS
HW12: Where do BigSibs come from?
2021-10-06
*/

/*
DISCO: Using a constructor can shorten the code by a few lines
QCC: Why can't we just use a basic system.out.print(" ")?Would seem much simpler.
*/

public class Greet{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib("Word up");
    		greeting = richard.greet("freshman");
    		System.out.println(greeting);
		
		BigSib Dill = new BigSib("Salutations");
		greeting = Dill.greet("Dr. Spaceman");
		System.out.println(greeting);


		BigSib Jill = new BigSib("Hey ya");
		greeting = Jill.greet("Kong Fooey");
		System.out.println(greeting);

		BigSib Bill = new BigSib("sup");
		greeting = Bill.greet("mom");
		System.out.println(greeting);
  	} 
} 

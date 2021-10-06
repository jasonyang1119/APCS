/*
BJLT + Tommy + Bob
APCS
HW12: OnElderIndividualityandtheEliminationofRadioFuzz
2021-10-05
*/

/*
DISCO: You can have an instance variable is it is in a non static class
QCC: Why can't we just use a basic system.out.print(" ")?Would seem much simpler.
*/


public class Greet{
	public static void main(String[] args)
	{
		String greeting;

		BigSib richard = new BigSib();

    		richard.setHelloMsg("Word up");
    		greeting = richard.greet("freshman");
    		System.out.println(greeting);
		
		BigSib Dill = new BigSib();
		Dill.setHelloMsg("Salutations");
		greeting = Dill.greet("Dr. Spaceman");
		System.out.println(greeting);


		BigSib Jill = new BigSib();
		Jill.setHelloMsg("Hey ya");
		greeting = Jill.greet("Kong Fooey");
		System.out.println(greeting);

		BigSib Bill = new BigSib();
		Bill.setHelloMsg("Sup");
		greeting = Bill.greet("mom");
		System.out.println(greeting);
  	} 
} 

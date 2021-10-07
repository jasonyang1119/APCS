/*
BJLT + Tommy + Bob
APCS
HW12: OnElderIndividualityandtheEliminationofRadioFuzz
2021-10-06
*/

/*
DISCO: You can have an instance variable is it is in a non static class
QCC: Why can't we just use a basic system.out.print(" ")?Would seem much simpler.
*/



public class BigSib {
	public String helloMsg;

	public String greet(String newname){
		return helloMsg  + " " + newname ;

	}
	public BigSib(String name){
		helloMsg = name;
}
}

	
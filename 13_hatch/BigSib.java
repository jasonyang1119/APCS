/*
BJLT (Jason Yang, Lindsay Phung, Bob, Terry)
APCS
HW12: Where do BigSibs come from?
2021-10-06
*/

/*
DISCO:Using a constructor and reduce the amount of code
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

	

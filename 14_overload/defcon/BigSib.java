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



public class BigSib {
	public String helloMsg;
	
	public BigSib(){
		helloMsg= "Wdo";
	}
	public BigSib(String input){
		helloMsg=input;
	}
	public String greet(String input){
		return helloMsg  + " " + input ;
	}
}

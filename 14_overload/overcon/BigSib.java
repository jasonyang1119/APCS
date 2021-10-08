/*
Jason Yang/Bob , Lindsay Phung/Terry , Parl Serbanescu
APCS
HW14: Customize Your Creation
2021-10-07
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
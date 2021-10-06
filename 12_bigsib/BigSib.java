public class BigSib {
	public String helloMsg;

	public String greet(String newname){
		return helloMsg  + " " + newname ;
	}

	public void setHelloMsg(String newname){
		helloMsg = newname;
	}
}
public class Die{
  private int numOfFaces;
  private int faceValue;
  private static int numOfDies = 0;

  public Die(){
    numOfFaces = 6;
    roll();
    numOfDies++;
  }

  public Die(int a){
    numOfFaces = a;
    roll();
    numOfDies++;
  }

  public int getFaceValue(){
    return faceValue;
  }

  public int getNumOfFaces(){
    return numOfFaces;
  }

  public void roll(){
    faceValue = (int) (Math.random() * numOfFaces) + 1;
  }

  public String toString(){
    return "Number of faces is " + numOfFaces + ". Face Value is " + faceValue;
  }

  public boolean equals(Die other){
    return (numOfFaces == other.getNumOfFaces() && faceValue == other.getFaceValue());
}

 public static int getNumOfDies(){
   return numOfDies;
 }
}


/*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences 
(in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.*/

public class endOther {
    public static void main(String[] args) {
        endOther test = new endOther();
        System.out.println(test.endOther("Hiabc", "abc"));
        System.out.println(test.endOther("AbC", "HiaBc"));
        System.out.println(test.endOther("abc", "abXabc"));
    }


public boolean endOther(String a, String b) {
  String alower = a.toLowerCase();
  String blower = b.toLowerCase();
  int alength = alower.length();
  int blength = blower.length();

  if (alength > blength){
    return blower.equals(alower.substring(alength-blength,alength));
  } else {
    return alower.equals(blower.substring(blength-alength,blength));
  }
  }
}

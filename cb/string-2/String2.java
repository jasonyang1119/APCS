/* Jason Yang
   APCS
   HW28: PPMP - CodingBat String loops
   2021-10-30
   time spent - 1.2 hours
*/

public class String2 {
	
    public static void main(String[] args) {
        System.out.println("cases for countHi");
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
        System.out.println("cases for doubleChar");
        System.out.println(doubleChar("The")); // "TThhee"
        System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
        System.out.println("cases for catDog");
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
        System.out.println("cases for countCode");
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
        System.out.println("cases for endOther");
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
        System.out.println("cases for xyzThere");
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }




public boolean catDog(String str) {
  int catcounter = 0;
  int dogcounter = 0;
  for (int i = 0; i < str.length()-2; i++){
    if ( str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't' ){
        catcounter = catcounter + 1;
  }
    if ( str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g' ){
        dogcounter = dogcounter + 1;
    }
  }
  if (dogcounter == catcounter){
    return true;
  } else {
    return false;
  }
}
//Return true if the string "cat" and "dog" appear the same number of times in the given string.



	public int countCode(String str) {
  int answer = 0;
  for (int i = 0; i < str.length()-3; i++){
    if ((str.substring(i, i + 2) + str.charAt(i + 3)).equals("coe")){
      answer = answer + 1;
    }
  }
  return answer;
}
// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count. 



public int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < str.length()-1; i++){
    if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
      counter = counter + 1;
    }
  }
    return counter;
}
//Return the number of times that the string "hi" appears anywhere in the given string.


public String doubleChar(String str) {
  String first = "";
  for (int i = 0; i<str.length(); i++){
    first = first + str.charAt(i) + str.charAt(i);
  }
  return first;
}
/*Given a string, return a string where for every char in the original, there are two chars.*/

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
/*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences 
(in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.*/


public boolean xyzThere(String str) {
  for (int i = 0; i < str.length()-2; i++){
      if (str.substring(i, i + 3).equals("xyz")){
        if (i == 0 || str.charAt(i - 1) != '.')
        return true;
        }
      }
      return false;
  }
/*Return true if the given string contains an appearance of "xyz" where the xyz
is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not. */
}

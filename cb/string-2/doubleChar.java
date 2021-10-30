/*Given a string, return a string where for every char in the original, there are two chars.*/

public static void main(String[] args) {
        doubleChar test = new doubleChar();
        System.out.println(test.doubleChar("The"));
        System.out.println(test.doubleChar("AAbb"));
        System.out.println(test.doubleChar("Hi-There"));
        System.out.println(test.doubleChar("Word!"));
        System.out.println(test.doubleChar("!!"));
    }

public String doubleChar(String str) {
  String first = "";
  for (int i = 0; i<str.length(); i++){
    first = first + str.charAt(i) + str.charAt(i);
  }
  return first;
}
}

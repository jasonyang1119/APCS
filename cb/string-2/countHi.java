/*Return the number of times that the string "hi" appears anywhere in the given string.*/

public class countHi {
    public static void main(String[] args) {
        countHi hi = new countHi();
        System.out.println(hi.countHi("abc hi ho"));
        System.out.println(hi.countHi("ABChi hi"));
        System.out.println(hi.countHi("hihi"));
    }


public int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < str.length()-1; i++){
    if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
      counter = counter + 1;
    }
  }
    return counter;
}
}

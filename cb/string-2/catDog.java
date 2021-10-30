//Return true if the string "cat" and "dog" appear the same number of times in the given string.



public class catDog {
    public static void main(String[] args) {
        catDog test = new catDog();
        System.out.println(test.catDog("catdog"));
        System.out.println(test.catDog("catcat"));
        System.out.println(test.catDog("1cat1cadodog"));
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
}

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

public int countHi(String str) {
  int counter = 0;
  for (int i = 0; i < str.length()-1; i++){
    if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
      counter = counter + 1;
    }
  }
    return counter;
}

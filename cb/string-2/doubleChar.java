public String doubleChar(String str) {
  String first = "";
  for (int i = 0; i<str.length(); i++){
    first = first + str.charAt(i) + str.charAt(i);
  }
  return first;
}

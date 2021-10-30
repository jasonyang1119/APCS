public int countCode(String str) {
  int answer = 0;
  for (int i = 0; i < str.length()-3; i++){
    if ((str.substring(i, i + 2) + str.charAt(i + 3)).equals("coe")){
      answer = answer + 1;
    }
  }
  return answer;
}

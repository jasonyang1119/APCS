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

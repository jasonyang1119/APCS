
/*Return true if the given string contains an appearance of "xyz" where the xyz
is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not. */

public static void main(String[] args) {
        xyzThere test = new xyzThere();
        System.out.println(test.xyzThere("abcxyz"));
        System.out.println(test.xyzThere("abc.xyz"));
        System.out.println(test.xyzThere("xyz.abc"));
    }

public boolean xyzThere(String str) {
  for (int i = 0; i < str.length()-2; i++){
      if (str.substring(i, i + 3).equals("xyz")){
        if (i == 0 || str.charAt(i - 1) != '.')
        return true;
        }
      }
      return false;
  }
}

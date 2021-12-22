public class IntParse{
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    boolean negative = false;
    int output = 0;
    int y;
    int newDigit;
    if (s.charAt(0) == '-'){
      s = s.substring(1);
      negative = true;
    }
    for (int x = 0; x < s.length(); x++){
      y = s.length() - x - 1;
      newDigit = valueOfDigit(s.charAt(y));
      output += valueOfDigit(s.charAt(y)) * Math.pow(10, x);
    }
    if (negative){
      return output * -1;
    }
    return output;
  }
  public static int valueOfDigit(char c){
    return c - 48;
  }

  public static void main(String[] args){
    System.out.println(stringToInt("506342") + 1);
    System.out.println(stringToInt("-450064") + 1);
    System.out.println(stringToInt("-0000") + 1);
    System.out.println(stringToInt("004960") + 1);
  }
}

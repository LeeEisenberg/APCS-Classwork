public class IntParse{
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    boolean negative = false;
    int output = 0;
    int y;
    if (s.charAt(0) == '-'){
      s = s.substring(1);
      negative = true;
    }
    for (int x = 0; x < s.length(); x++){
      y = s.length() - x - 1;
      output += Math.pow(valueOfDigit(s.charAt(y)), x);
    }
    if (negative){
      return output * -1;
    }
    return output;
  }
  public static int valueOfDigit(char c){
    return c - 48;
  }
}

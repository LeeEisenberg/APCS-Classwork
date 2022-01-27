public class NumWord{
  public static String numWord(int num){
    if (num/10 == 0){
      if (num == 0){
        return "zero"; //this is an edge case watch out
      }else if (num == 1){
        return "one";
      }else if (num == 2){
        return "two";
      }else if (num == 3){
        return "three";
      }else if (num == 4){
        return "four";
      }else if (num == 5){
        return "five";
      }else if (num == 6){
        return "six";
      }else if (num == 7){
        return "seven";
      }else if (num == 8){
        return "eight";
      }else if (num == 9){
        return "nine";
      }
    }
  }
}

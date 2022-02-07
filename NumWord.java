public class NumWord{
  public static String numWord(int num){
    int temp;
    if (num/10 == 0){
      temp = num;
      if (temp == 0){
        return "zero"; //this is an edge case watch out
      }else if (temp == 1){
        return "one";
      }else if (temp == 2){
        return "two";
      }else if (temp == 3){
        return "three";
      }else if (temp == 4){
        return "four";
      }else if (temp == 5){
        return "five";
      }else if (temp == 6){
        return "six";
      }else if (temp == 7){
        return "seven";
      }else if (temp == 8){
        return "eight";
      }else if (temp == 9){
        return "nine";
      }
    }else if (num/100 == 0){
      temp = num/10;
      if (temp == 1){
        temp = num%10;
        if (temp == 0){
          return "ten";
        }else if (temp == 1){
          return "eleven";
        }else if (temp == 2){
          return "twelve";
        }else if (temp == 3){
          return "thirteen";
        }else if (temp == 4){
          return "fourteen";
        }else if (temp == 5){
          return "fifteen";
        }else if (temp == 6){
          return "sixteen";
        }else if (temp == 7){
          return "seventeen";
        }else if (temp == 8){
          return "eighteen";
        }else if (temp == 9){
          return "nineteen";
        }
      }else if (temp == 2){
        return "twenty-" + numWord(num%10);
      }else if (temp == 3){
        return "thirty-" + numWord(num%10);
      }else if (temp == 4){
        return "forty-" + numWord(num%10);
      }else if (temp == 5){
        return "fifty-" + numWord(num%10);
      }else if (temp == 6){
        return "sixty-" + numWord(num%10);
      }else if (temp == 7){
        return "seventy-" + numWord(num%10);
      }else if (temp == 8){
        return "eighty-" + numWord(num%10);
      }else if (temp == 9){
        return "ninety-" + numWord(num%10);
      }
    }else if (num/1000 == 0){
      temp = num/100;
      return numWord(temp) + " hundred " + numWord(num%100);
    }
    return "-1";
  }

  public static void main(String[] args){
    System.out.println(numWord(0));
    System.out.println(numWord(45));
    System.out.println(numWord(274));
  }
}

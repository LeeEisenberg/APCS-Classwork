public class Recursion{
  public static int fact(int n){
    if (n > 1){
      return n * fact(n-1);
    }
    return 1;
  }

  public static boolean isEven(int n){
    if (n == 0){
      return true;
    }
    if (n == 1){
      return false;
    }
    return isEven(n-2);
  }

  public static void main(String[] args){
    for (int x = 0; x < 13; x++){
      System.out.println(fact(x));
    }
    for (int x = 0; x < 10; x++){
      System.out.println(isEven(x));
    }
  }
}

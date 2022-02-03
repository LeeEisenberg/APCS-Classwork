public class RecursionDemo{
  public static void makeWords(int size, String ans){
    if (size == 0){
      System.out.println(ans);
    }else{
      for (char x = 'a'; x <= 'z'; x++){
        makeWords(size-1, ans+x);
      }
    }
  }

  public static void main(String[] args){
    //makeWords(2, "");
    //makeWords(3, "");
    makeWords(4, "");
  }
}

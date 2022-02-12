public class SplitArray{
  public static boolean splitArray(int[] arr){
    return splitArray(arr, 0, 0);
  }
  public static boolean splitArray(int[] arr, int sum, int index){
    if (index == arr.length){
      return sum == 0;
    }
    return (splitArray(arr, sum+arr[index], index+1) || splitArray(arr, sum-arr[index], index+1));
  }

  public static void main(String[] args){
    System.out.println(splitArray([2, 2]));// is true
    System.out.println(splitArray([2, 3]));// is false
    System.out.println(splitArray([5, 2, 3]));// is true
    System.out.println(splitArray([10, 2, 3, 1]));// is false
  }
}

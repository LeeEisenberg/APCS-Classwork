public class PartSum{
  public static boolean partSum(int[] nums, int goal){
    return partSum(nums, goal, 0);
  }
  public static boolean partSum(int[] nums, int goal, int index){
    if (goal == 0){
      return true;
    }
    if (goal < 0 || index == nums.length){
      return false;
    }
    return partSum(nums, goal-nums[index], index+1) || partSum(nums, goal, index+1);
  }

  public static void main(String[] args){
    System.out.println(partSum(new int[] {2,4,8},10));
    System.out.println(partSum(new int[] {2,4,8},14));
    System.out.println(partSum(new int[] {2,4,8},9));
    System.out.println(partSum(new int[] {2,3,7,10},9));
  }
}

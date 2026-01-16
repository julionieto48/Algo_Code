import java.util.HashMap;
import java.util.Map;

public class Main {
  
  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 3, 5, 8};
    int target = 10;

    twoSum(nums, target);
    twoSumHash(nums, target);
  }

  public static void twoSum(int[] nums, int target){
    for(int i = 0; i < nums.length; i++){
      for(int j = i + 1; j < nums.length; j++){
        if(nums[i] + nums[j] == target){
          System.out.println("[" + i + ", " + j + "]");
        }
      }
    }
  }

  public static void twoSumHash(int[] nums, int target) {
    
    Map<Integer, Integer> vistos = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int actual = nums[i];
      int faltante = target - actual;
  
      if (vistos.containsKey(faltante)) {
        System.out.println("[" + vistos.get(faltante) + ", " + i + "]");
        return; // porque el problema garantiza una sola solución
      }
  
      vistos.put(actual, i);
    }
  }
}
import java.util.Arrays;

class leet3024 {
  public String triangleType(int[] nums) {
    Arrays.sort(nums);
    if (nums[0] + nums[1] <= nums[2])
      return "none";
    if (nums[0] == nums[1] && nums[1] == nums[2])
      return "equilateral";
    if (nums[0] == nums[1] || nums[1] == nums[2])
      return "isosceles";
    return "scalene";
  }
}



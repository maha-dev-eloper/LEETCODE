class Solution {
    public static void main(String[] args) {
        int[] nums = {12, 6, 1, 2, 7};
         int result = maximumTripletValue(nums);

         System.out.println(result);
    }
    public static int maximumTripletValue(int[] nums) {
        int n = nums.length;
        int maxValue = Integer.MIN_VALUE; 

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {                
                    int value = (nums[i] - nums[j]) * nums[k];
                    maxValue = Math.max(maxValue, value);
                }
            }
        }
        return maxValue < 0 ? 0 : maxValue;
    }
}

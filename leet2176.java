class leet2176 {
    // Method to count the number of pairs (i, j) such that nums[i] == nums[j] and the product of i and j is divisible by k.
    public int countPairs(int[] nums, int k) {
        int length = nums.length; // Store the length of the input array nums.
        int pairCount = 0;       // Initialize the counter for the number of valid pairs to 0.

        // Iterate over the elements using two nested loops to consider all possible pairs (i, j) where i < j.
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                // Check if the values at index i and j are equal and if the product of i and j is divisible by k.
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    pairCount++; // If condition met, increment the count of valid pairs.
                }
            }
        }
        return pairCount; // Return the total number of valid pairs found.
    }
}
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class leet3375 {
    public int minOperations(int[] nums, int k) {
      Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
      final int mn = Arrays.stream(nums).min().getAsInt();
      if (mn < k)
        return -1;
      if (mn > k)
        return numsSet.size();
      return numsSet.size() - 1;
    }
  }
public class tenRun {
  public int[] tenRun(int[] nums) {
    int len = nums.length;

    for (int i = 0; i < len; i++) {
      if (nums[i] % 10 == 0) {
        for (int j = i + 1; j < len && nums[j] % 10 != 0; j++) {
          nums[j] = nums[i];
        }
      }
    }
    return nums;
  }
}

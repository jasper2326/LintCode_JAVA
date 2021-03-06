public class MissingNumber {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ i;
            result = result ^ nums[i];
        }
        return result;
    }
}

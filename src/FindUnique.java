public class FindUnique {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,5,4,3,1,2,5,6};
        System.out.println(unique(nums));
    }
    static int unique (int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

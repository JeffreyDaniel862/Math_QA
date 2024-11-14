public class NoOfSetBits {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
    }
    static int setBits (int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }
}
// AND Num with num - 1 until num becomes zero to find the number of set bits
// 9 is 1001 AND 8 1000 i.e. (num - 1) gives 1000. then and 1000 (8) with 0111 (7) (num -1). then num becomes 0. No. of iteration is no. of set bits
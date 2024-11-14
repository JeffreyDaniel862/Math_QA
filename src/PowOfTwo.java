public class PowOfTwo {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(isPowOfTwo(num));
    }

    // n --> 4 = 100; n-1 --> 3 = 011 (n & (n -1)) will give 0 if power of two.

    static boolean isPowOfTwo (int num) {
        if (num < 1) return false;
        return (num & num - 1) == 0;
    }
}

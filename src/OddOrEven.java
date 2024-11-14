public class OddOrEven {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isEven(num));
        System.out.println(isOdd(num));
    }
    static boolean isOdd (int num) {
        return (num&1)==1;
        // It converts any base to base 2 and check whether (LSB, The Least Significant Bit) 0th digit is 1, because that's the only odd element in binary
        // 10 in binary 1010 & 1 will give 0000 so not odd
        // 1010 -> 10
        // &
        // 0001 -> 1 gives 0000
    }
    static boolean isEven (int num) {
        return (num&1)!=1;
    }
}

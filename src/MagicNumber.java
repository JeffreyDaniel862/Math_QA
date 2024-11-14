public class MagicNumber {
    // Magic number (Amazon question)
    // magic number of 6 in 5 is 150. How ?
    // what to do is multiply and add bits with base 5 and power of digits.
    // 6 in binary 110 set bits in 2 and 3 digits. so (5^3 * 1) + (5^2 * 1) + (5^1 * 0) = 150
    public static void main(String[] args) {
        int num = 6;
        System.out.println(findMagicNumber(num, 5));
    }
    static int findMagicNumber (int num, int base) {
        int result = 0;
        int incBase = base;

        while (num > 0) {
            int lastBit = num & 1; // finding the last bit. 110 -> 0
            result += base * lastBit; // multiply lastBit with base raise to digit power
            base *= incBase; // raise to corresponding power. initially 5. after 1st iteration 5*5. in second 25*5
            num = num >> 1; // right shit binary bits i.e. 110 -> 11
        }
        return  result;
    }
}

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 2;
        // 3^6 is what we need to find; we are doing that like multiply value in set bit with base 3.
        // for 6 binary rep is 110. 3^2 * 3^3
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) { // checking whether the bit is set or not
                ans *= base;
            }
            base *= base; // setting the base to the power of digit
            power = power >> 1; // move bit to right
        }
        System.out.println(ans);
    }
}

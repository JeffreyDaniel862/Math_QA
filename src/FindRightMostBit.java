public class FindRightMostBit {
    public static void main(String[] args) {
        int num = 6; // 110 right most set bit is 2.
        System.out.println(num & -num);
    }
}
        // to find this AND num with ~num.
        // -num is negative of num. That is represented in binary with help of 2's compliment.
//        Take the binary representation of the absolute value of the number.
//        Flip all the bits (i.e., change 0s to 1s and 1s to 0s).
//        Add 1 to the result.
//        The binary representation of 5 is 00000101.
//        Flip the bits: 11111010.
//        Add 1: 11111011.

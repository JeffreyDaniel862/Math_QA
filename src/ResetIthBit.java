public class ResetIthBit {
    public static void main(String[] args) {
        int binaryNumber = 0b1010110;
        int bit = 3;
        System.out.println(Integer.toBinaryString(resetBit(binaryNumber, bit)));
    }
    static int resetBit (int num, int bit) {
        int mask = ~(1 << (bit - 1));
        return num & mask;
    }
}
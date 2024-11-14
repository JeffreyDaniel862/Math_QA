public class SetIthBit {
    public static void main(String[] args) {
        int num = 0b100100;
        int bit = 4;
        setBit(num, bit);
    }
    static void setBit (int num, int bit) {
        int mask = 1 << (bit - 1); // mask with i-th bit set
        num = num|mask;
        System.out.println(Integer.toBinaryString(num));
    }
}

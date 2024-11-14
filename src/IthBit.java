public class IthBit {
    public static void main(String[] args) {
        int num = 10010;
        int bit = 3;
        System.out.println(findBit(num, bit));
    }
    static int findBit(int num, int bit) {
        int mask = 1 << (bit - 1); // Create a mask with the i-th bit set
        return (num & mask) != 0 ? 1 : 0; // Check if the i-th bit is set
    }
}

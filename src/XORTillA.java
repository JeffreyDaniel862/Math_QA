public class XORTillA {
    public static void main(String[] args) {
        System.out.println(xor(7));
    }
    static int xor(int num) {
        int expression = num % 4;
        return switch (expression) {
            case 0 -> num;
            case 1 -> 1;
            case 2 -> num + 1;
            default -> 0;
        };
    }
    /*
    * XOR Till 4 means 1 XOR 2 XOR 3 XOR 4
    * 0 XOR 0
    * 1 XOR 1
    * 2 XOR 3
    * 3 XOR 0
    * 4 XOR 4
    * 5 XOR 1
    * 6 XOR 7
    * 7 XOR 0
    * 8 XOR 8
    * The above xor method is created based on this observation
    * */
}

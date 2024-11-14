public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(40, 3));
    }
    static double sqrt (int num, int precise) {
        int start = 0;
        int end = num;

        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return mid; // return if perfect root is found
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // if perfect root is not found end variable hold the closest to perfect root
        // so assign end variable to root and find root in floating point
        root = end;
        double incr = 0.1;
        for (int i = 0; i < precise; i++) {
            while (root * root <= num) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}

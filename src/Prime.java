public class Prime {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(isPrime(num));
        sieve(37);
    }
    static boolean isPrime(int num) {
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }

    // Sieve of Eratosthenes
    static void sieve (int num) {
        boolean[] check = new boolean[num + 1];
        for (int i = 2; i*i <= num; i++) {
            if (!check[i]) {
                for (int j = i*2; j <= num; j+=i) {
                    check[j] = true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (!check[i]) System.out.print(i + " ");
        }
    }
}

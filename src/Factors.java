import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int num = 37;
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i * i <= num) {
            if (num % i == 0) {
                if (num/i != i) {
                    list.add(num/i);
                }
                System.out.print(i + " ");
            }
            i++;
        }
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}

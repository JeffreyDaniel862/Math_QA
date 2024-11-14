import java.util.Arrays;

public class FlipAnImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        flip(matrix);
        printMatrix(matrix);
    }
    static void flip (int[][] grid) {
        for (int[] arr : grid) {
            reverse(arr);
        }
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start] ^ 1;
            arr[start] = arr[end] ^ 1;
            arr[end] = temp;
            start++;
            end--;
        }
        arr[start] = arr[start] ^ 1;
    }
    static void printMatrix (int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

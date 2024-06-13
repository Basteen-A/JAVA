import java.util.Scanner;

public class SumOfLeftElements {
    public static void main(String[] bastee) {
        Scanner scanner = new Scanner(System.in);


        int size = scanner.nextInt();
        long[] arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextLong();
        }						\\Sum Of Left Elements of Array
        long sum = 0;
        for (int i = 0; i < size; i++) {
            long temp = arr[i];
            arr[i] = sum;
            sum += temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

OUTPUT:


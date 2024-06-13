import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] bastee) {
        Scanner scanner = new Scanner(System.in);
        int i,j,temp;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for ( j = 0; j < size; j++) {
            arr[j] = scanner.nextInt(); //Array Reverse
        }
   for(i=size-1;i>=0;i--){
	System.out.print(arr[i]+" ");
   }
}
}

//OUTPUT :
5
10 20 30 40 50
50 40 30 20 10
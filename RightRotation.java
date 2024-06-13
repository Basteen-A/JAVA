import java.util.Scanner;

public class RightRotation {
    public static void main(String[] bastee) {
        Scanner scanner = new Scanner(System.in);

       int temp=0,i,k;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for ( i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }							//RIGHT ROTATION OF ARRAYS
      
      int rot_count=1;
for(k=1;k<=rot_count%size;k++)  //how many times of rotation 
  temp=arr[size-1];  //last index value stored in temp variable
     for(i=size-1;i>=1;i--){
        arr[i]=arr[i-1];   //swift the elments k times
}
arr[0]=temp;  // lastly stored temp value in 0Th index
for(int j:arr){
System.out.print(j+" ");
  }
 }
}

OUTPUT:
5
10 20 30 40 50
50 10 20 30 40
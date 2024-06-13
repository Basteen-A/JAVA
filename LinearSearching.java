import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] bastee) {
        Scanner scanner = new Scanner(System.in);

       boolean flag=false;
        int i,k;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for ( i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }						// LINEAR SEARCHING
        int num=scanner.nextInt();
       for(i=0;i<size;i++){
	if(arr[i]==num){
          flag=true;
	  break;}
	}
  if(flag==true){
	System.out.println("Element Found");}
 else{
   System.out.println("Element Not Found");}
}
}
// OUTPUT :
5
10 20 30 40 50
50
Element Found

// OUTPUT :
5
10 20 30 40 50
60
Element Not Found
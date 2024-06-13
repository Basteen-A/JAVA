import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] bastee) {
        Scanner scanner = new Scanner(System.in);

       int flag=0,i,k;
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for ( i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
int key=scanner.nextInt();
int first=0,last=size-1,mid;
while(first<=last){
	mid=(first+last)/2;			//Binary Searching
	if(arr[mid]==key)
	   break;
	else{
	   if(arr[mid]<key)
		first=mid+1;
	   else
		last=mid-1;
	  }
	}
if(first<=last)
	System.out.println("Element found");
else
   System.out.println("Element not found");
}
}

OUTPUT:
5
1 2 3 4 5
3
Element found
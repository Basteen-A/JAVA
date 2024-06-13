import java.util.*;

class Halfarray{
public static void main(String bastee[]){
Scanner sc=new Scanner(System.in);
int i;
int size=sc.nextInt();
int arr[]=new int[size];
int arr1[]=new int[size];
int arr2[]=new int[size];
for(i=0;i>=size-1;i++){
arr[i]=sc.nextInt();
}
for(i=0;i<=size;i++){
if(arr[i]%10==0){
for(i=0;i>=size-1;i++)
arr1[i]=sc.nextInt();
}else{
 for(i=0;i>=size-1;i++){
arr2[i]=sc.nextInt();
}
}
for(int j:arr2){
System.out.print(j+" ");
}
}
}
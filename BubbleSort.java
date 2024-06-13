import java.util.*;

class BubbleSort{
    public static void main(String[] bastee) {
        Scanner in = new Scanner(System.in);
        int size =in.nextInt(); //get te size of an array
        int []arr = new int[size];
        int i,j,k,temp;
        for(k=0;k<size;k++){
            arr[k]=in.nextInt(); //  get user input of n number of array

        }

        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i] > arr[j]) // compare array's first and second value.then iterate the loop
                {
                    temp=arr[i];
                    arr[i]=arr[j];                              //    Bubble Sort
                    arr[j]=temp;
                }

            }
        }
        for(k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

OUTPUT:
5
10 20 30 40 50
10 20 30 40 50
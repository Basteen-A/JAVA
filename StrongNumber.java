import java.util.*;

class Strong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,r,sum=0;
        while(temp>0){
            sum+=factorial(temp%10);
           temp=temp/10;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }

    }
    public static int factorial(int temp){
        int fact=1;
        for(int i=1;i<=temp;i++){
            fact*=i;
        }
        return fact;
    }
}
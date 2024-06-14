import java.util.*;

class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r,temp,digit=0,sum=0;
        temp=num;
while(temp>0){
    temp=temp/10;
    digit++;
}
    temp=num;
while(temp>0){
    r=temp%10;
    sum+=Math.pow(r,digit);
    temp=temp/10;
}
if(sum==num){
    System.out.println("Armstrong Number");
}else{
    System.out.println("Not Armstrong");
}
}
}
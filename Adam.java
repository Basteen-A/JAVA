import java.util.*;

public class main{
    public static void main (String bastee[]){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
        int a =sc.nextInt();
      
        int b,d,e,f;
        b=Squre(a);
        d=rev(a);
        e=Squre(d);
        f=rev(e);
        if(b==f){
            System.out.println("Adam number");
        }else{
          System.out.println("Not Adam number") ; 
        }
    }
     public static int Squre(int a){
           int c= a*a;
            return c;
        }
        public  static int rev(int a){
        int s=0,r;
           while(a>0){
            r=a%10;
            s=(s*10)+r;
            a=a/10;
           }
           return s; 
        }
}
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int rem=0,originalnum,result=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        originalnum=num;
        while(num!=0)
        {
            rem=num%10;
            result+=Math.pow(rem,3);
            num/=10;
        }
        if(result==originalnum)
        System.out.println(originalnum+" is an Armstrong Number");
        else
        System.out.println(originalnum+" is not an Armstrong Number");
        sc.close();
    }   
    
}

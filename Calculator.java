import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int choice;
        float a,b,ans;
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t\tCALCULATOR");
        System.out.println("\nEnter a Choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
        choice=input.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("ADDITION: Enter two numbers: ");
                a=input.nextFloat();
                b=input.nextFloat();
                ans=a+b;
                System.out.println(a+"+"+b+"="+ans);
                break;
            }
            case 2:
            {
                System.out.println("SUBTRACTION: Enter two numbers:");
                a=input.nextFloat();
                b=input.nextFloat();
                ans=a-b;
                System.out.println(a+"-"+b+"="+ans);
                break;
            }
            case 3:
            {
                System.out.println("MULTIPLICATION: Enter two numbers:");
                a=input.nextFloat();
                b=input.nextFloat();
                ans=a*b;
                System.out.println(a+"*"+b+"="+ans);
                break;
            }
            case 4:
            {
                System.out.println("DIVISION: Enter two numbers:");
                a=input.nextFloat();
                b=input.nextFloat();
                ans=a/b;
                System.out.println(a+"/"+b+"="+ans);
                break;
            }
            default:
            System.out.println("~~~~~~~~~~~~INVALID INPUT!!!~~~~~~~~~");
        }
        input.close();
    }
}

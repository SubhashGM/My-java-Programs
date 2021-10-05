import java.util.*;
class BerthEx
{
    public static void main(String[] args) {
         int seat,berth;
         System.out.print("Enter a number(1-72): ");
         Scanner sc=new Scanner(System.in);
         seat=sc.nextInt();
         berth=seat%8;
         switch(berth)
         {
             case 1:
             System.out.println("Lower Berth");
             break;
             case 2:
             System.out.println("Middle Berth");
             break;
             case 3:
             System.out.println("Upper Berth");
             break;
             case 4:
             System.out.println("Lower Berth");
             break;
             case 5:
             System.out.println("Middle Berth");
             break;
             case 6:
             System.out.println("Upper Birth");
             break;
             case 7:
             System.out.println("Side Berth");
             break;
             case 0:
             System.out.println("Side Lower");
             break;
             default:
             System.out.println("Invalid Input!");
         }
         sc.close();
    }
}
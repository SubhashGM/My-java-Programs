import java.util.Scanner;
public class Ascii {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int a;  
        char ch;
        System.out.println("Enter a Character: ");
        ch=sc.next().charAt(0);
        a=(int)ch;
        System.out.print("ASCII value of "+ch+" is "+a);
        sc.close();
    }
}

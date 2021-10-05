import java.util.Scanner;
public class Arrayumeg2
{

static void add(int a[])
{
    int sum=0;
    System.out.println("OUTPUT");
    for(int i:a)
    {
        sum+=a[i];
    }
    System.out.println(sum);
}
public static void main(String args[])
{
int a[];
a=new int[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter"+a.length+"Elements");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
add(a);
add(new int[]{1,2,3,4});
}
}

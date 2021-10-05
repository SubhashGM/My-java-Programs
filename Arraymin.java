public class Arraymin
{
public static int min(int a[])
{
int m=a[0];
for(int i=1;i<a.length;i++)
{
if(m>a[i])
{
m=a[i];
}
}
return(m);
}

public static void main(String args[])
{
int r=min(new int[]{2,7,8,1,5});
System.out.println("MINIMUM ELEMENT is "+r);
}
}
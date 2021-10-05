import java.util.Scanner;

public class Constructor {
    double h,w,d;

     Constructor(double width,double height,double length)
    {
        h=height;
        w=width;
        d=length;
    }
    double volume()
    { double volume;
    volume=h*w*d;
    return volume;
    }
   
    public static void main(String[] args) {
    int wid,ht,len;
    Scanner sc=new Scanner(System.in);
    wid=sc.nextInt();
    ht=sc.nextInt();
    len=sc.nextInt();
    Constructor o = new Constructor(wid,ht,len);
    System.out.println(o.volume());
    sc.close();
    }

}
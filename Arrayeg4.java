public class Arrayeg4 {
    public static void main(String[] args)
    {
        int a[] = { 1,2,3,4,5,6 };
 
        int b[] = new int[a.length];
 
       
        System.arraycopy(a,0, b, 2, 3);
 
    
 //arraycopy(object src, int srcpos, object des,int despos, int length)



        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
 
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}
public class Arrdisp {
    public static void Display(int b[])
    {
        for(int i:b)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Display(new int[]{1,2,3,5});
    }    
}

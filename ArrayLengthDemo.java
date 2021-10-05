//import java.io.*;
public class ArrayLengthDemo
{
public static void main(String[] args) 
   {
    // creates and initializes an array of integers
    int[] source = {100, 200, 300};
    // creates an integer array with 3 element
    int[] dest = new int[3];
    // copying an elements from source to dest array
    System.arraycopy(source, 0, dest, 0, source.length);
    for (int i =0; i < dest.length; i++)
    System.out.println("Element at index " + i + ": " + 
    dest[i]);
   }
}
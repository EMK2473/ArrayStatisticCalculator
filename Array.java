/*
 
 Input header information here
 
 */

import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        double[] ary = new double[20];
        
        Scanner scan = new Scanner(System.in);
        
        int index = 0;
        while(scan.hasNext())
            {
                ary[index] = scan.nextDouble();
                
                index++;
            }
        
        for(int i = 0; i < ary.length; i++)
            {
                System.out.println(ary[i]);
            }
    }
}

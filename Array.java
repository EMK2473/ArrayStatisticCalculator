/*
 
 Input header information here
 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Array
{
    public static void main(String[] args){
        double[] ary = new double[20];
        double sum = 0;
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        int index = 0;

        while(scan.hasNext())
            {
                ary[index] = scan.nextDouble();
                sum += ary[index];
                count++;
                index++;
            }

        for(int i = 0; i < ary.length; i++)
            {
                System.out.println(ary[i]);
            }
        
        // sort array and calculate values for min, max, mean, median, and mode
        Arrays.sort(ary);


        System.out.println();
        System.out.println("Ascending Order:");

    
        scan.close();
    }
}

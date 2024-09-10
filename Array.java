/*
 
 Input header information here
 
 */

import java.util.Scanner;

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

            System.out.println("TEST");
            System.out.println("count: " + count);
            System.out.println("sum: " + sum);
        
        for(int i = 0; i < ary.length; i++)
            {
                System.out.println(ary[i]);
            }
            double average = sum / count;
            System.out.print("Average: ");
            System.out.printf("%.2f", average);
            scan.close();
    }
}

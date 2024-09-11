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
        double min = ary[0];
        double max = ary[ary.length - 1];
        double mean = sum / count;
        double median;

        System.out.println();
        System.out.println("Ascending Order:");

        for(double num : ary) {
            System.out.println(num);
        }

        if (ary.length % 2 == 0) {
            int midIndex1 = (ary.length / 2) - 1; // Index 9
            int midIndex2 = ary.length / 2;       // Index 10
            median = (ary[midIndex1] + ary[midIndex2]) / 2.0;
        } else {
            median = ary[ary.length / 2];
        }

        System.out.println();
        System.out.print("Min: ");
        System.out.printf("%.2f", min);
        System.out.println();
        System.out.print("Max: ");
        System.out.printf("%.2f", max);
        System.out.println();
        System.out.print("Mean: ");
        System.out.printf("%.2f", mean);
        System.out.println();
        System.out.print("Median: ");
        System.out.printf("%.1f", median);

        findMode(ary);
        scan.close();
    }
    public static void findMode (double[] ary) {
        int maxCount = 0;
        int currentCount = 1;
        double previousVal = ary[0];
    
        for(int i = 1; i < ary.length; ++i){
            if(ary[i] == previousVal ){
                currentCount++;
            }
            else {
                if(currentCount > maxCount){
                    maxCount = currentCount;
                }
                currentCount = 1;
                previousVal = ary[i];
            }
            System.out.println(maxCount);
        System.out.println(previousVal);
        }
        if(currentCount > maxCount){
            maxCount = currentCount;
    }
    System.out.println(currentCount);

    }
}



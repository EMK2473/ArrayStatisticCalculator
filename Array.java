/*
Array Statistics Calculator
Project 2
Eric Keeton

Input: This program expects 20 numbers as input from the command line. The input provided should be used via redirection from the `input.txt` file.

Output: The program outputs the minimum, maximum, mean, median, and mode of the input numbers.

Purpose: This program reads 20 numbers from the input, calculates and displays the statistics including the minimum, maximum, mean, median, and mode. 
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

        // sort array and calculate values for min, max, mean, median, and mode
        Arrays.sort(ary);
        double min = ary[0];
        double max = ary[ary.length - 1];
        double mean = sum / count;
        double median;

        System.out.println();
        System.out.println("Ascending Order:");

        // for each loop to print in ascending order
        for(double num : ary) {
            System.out.println(num);
        }

        if (ary.length % 2 == 0) {
            int midIndex1 = (ary.length / 2) - 1; 
            int midIndex2 = ary.length / 2;       
            median = (ary[midIndex1] + ary[midIndex2]) / 2.0;
        } else {
            median = ary[ary.length / 2];
        }

        System.out.println();
        System.out.print("Minimum: ");
        System.out.printf("%.2f", min);
        System.out.println();
        System.out.print("Maximum: ");
        System.out.printf("%.2f", max);
        System.out.println();
        System.out.print("Mean: ");
        System.out.printf("%.2f", mean);
        System.out.println();
        System.out.print("Median: ");
        System.out.printf("%.2f", median);

        findMode(ary);
        scan.close();
    }
    
    public static void findMode (double[] ary) {
        int maxCount = 0;
        int currentCount = 1;
        double previousVal = ary[0];
        
        // maxCount tracks highest frequency of any value 
        // currentCount counts frequency of the current value
        // previousVal stores value being counted; updates whenever a new value is read

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
        }
        if(currentCount > maxCount){
            maxCount = currentCount;
    }

    // loop to find and print the values with max counts
    // mode is printed if their frequency matches maxCount
    currentCount = 1;
    previousVal = ary[0];

    System.out.println();
    System.out.print("Mode: ");

    for(int i = 1; i < ary.length; ++i){
        if(ary[i] == previousVal){
            currentCount++;
        }
        else {
            if(currentCount == maxCount){
                System.out.print(previousVal + " ");
            }
            currentCount = 1;
            previousVal = ary[i];
        }
    }
    if(currentCount == maxCount){
        System.out.print(previousVal);
    }
    }
}



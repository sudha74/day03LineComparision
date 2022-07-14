package com.day03;
import java.util.Scanner;
public class LineCompare {
    public static void main(String[] args) {
            double lengthOfline1, lengthOfline2;

            Scanner scanner=new Scanner(System.in);

            System.out.println("Welcome to Line Comparison Computation");

            System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
            lengthOfline1=getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());
            System.out.println(" enter values for x1,y1 and x2,y2 of line 1");
            lengthOfline2=getLength(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),scanner.nextInt());

            System.out.println("Length of line1 = "+lengthOfline1);
            System.out.println("Length of line2 = "+lengthOfline2);

            Integer l1= (int) lengthOfline1;
            Integer l2= (int) lengthOfline2;

            if (l1.compareTo(l2) > 0) {
                System.out.println("line 1 is greater than line 2");
            }else if (l1.compareTo(l2) < 0) {
                System.out.println("line 1 is smaller than line 2");
            }else
                System.out.println("both Lines are equal");
        }

        static double getLength(double x1, double y1, double x2, double y2){
            return ( Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) );
        }
    }



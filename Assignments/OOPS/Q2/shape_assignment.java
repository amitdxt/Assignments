package com.yash.oops.program;

import java.util.Scanner;

public class shape_assignment {
    public static void main(String[] args) {
        int P;
        int x, y;
        int r;
        r = 0;
        double shape;
        int c;
        int height;
        int width;

        Scanner reader = new Scanner(System.in);
        System.out.print("Choose a shape : ");
        shape = reader.nextInt();
        double circle;
        circle = 0;
        double rectangle;
        rectangle = 0;
        double triangle;
        triangle = 0;

        if (shape == circle) { 
            P = 2 * r;

            for (int i = 0; i <= P; i++) {
                for (int j = 0; j <= P; j++) {
                    x = r - i;
                    y = r - j;

                    c = x*x + y*y ;
 
                    if (c <= r * r + 1) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
       }
       else if(shape == rectangle) {
           Scanner scan = new Scanner(System.in); 
           System.out.print("Enter the number of widths: ");
           width = scan.nextInt();

           // input for width
           System.out.print("Enter the number of widths: ");
           height = scan.nextInt();

           
           for (int i = 1; i <= width; i++) {
               for (int j = 1; j <= height; j++) {
                   System.out.print("*");
               }
               System.out.print("\n");
           }

           if (shape == triangle) {
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the number of rows to be printed");
               int rows = sc.nextInt();

               for (int i = 1; i <= rows; i++) {
                   for (int j = rows; j >= i; j--) {
                       System.out.print(" ");
                   }
           
                   for (int j = 1; j <= i; j++) {
                       System.out.print("* ");
                   }
            
                    System.out.println();
                }
            }
        }
    }
}
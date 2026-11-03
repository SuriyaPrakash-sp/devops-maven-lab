
package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int n = sc.nextInt();
        double bill = 0;
        if (n < 0) {
            System.out.println("Invalid units!");
        }else if (n <= 100) {
            bill = n * 1.5;
        }else if (n <= 200) {
            bill = (100 * 1.5) + ((n - 100) * 2.5);
        }else {
            bill = (100 * 1.5)+ (100 * 2.5)+ ((n - 200) * 4);
        }

        if (n >= 0) {
            System.out.println("Units Consumed: " + n);
            System.out.println("Total Bill: Rs. " + bill);
        }

        sc.close();
    }
}

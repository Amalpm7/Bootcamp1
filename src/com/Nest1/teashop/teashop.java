package com.Nest1.teashop;

import  java.util.Scanner;

public class teashop {

    public static void main(String[] args) {

        int x,y,total=0;

        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.println("Enter the option");
            System.out.println("1.Tea 10");
            System.out.println("2.Coffee 25");
            System.out.println("3.Cake 20");
            System.out.println("4.Sweets 15");
            System.out.println("5.Ice Cream 20");
            System.out.println("6.BILL");
            System.out.println("7.exit");
            y=scanner.nextInt();

            switch (y) {
                case 1:
                    System.out.println("Enter quantity");
                    x = scanner.nextInt();
                    total = (10 * x) + total;
                    break;
                case 2:
                    System.out.println("Enter quantity");
                    x = scanner.nextInt();
                    total = (25 * x) + total;
                    break;
                case 3:
                    System.out.println("Enter quantity");
                    x = scanner.nextInt();
                    total = (20 * x) + total;
                    break;
                case 4:
                    System.out.println("Enter quantity");
                    x = scanner.nextInt();
                    total = (15 * x) + total;
                    break;
                case 5:
                    System.out.println("Enter quantity");
                    x = scanner.nextInt();
                    total = (20 * x) + total;
                    break;
                case 6:System.out.println("Total Bill :"+total);
                    System.exit(0);
                case 7:
                    System.exit(0);
                    break;
            }
        }

    }
}
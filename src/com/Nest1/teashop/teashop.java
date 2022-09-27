package com.Nest1.teashop;

import java.util.ArrayList;
import java.util.HashMap;
import  java.util.Scanner;

public class teashop {

    public static void main(String[] args) {

        int qty,choice,mode,total=0;
        String name;
        Fooditems Food =new Fooditems(8,9,20,15,20);
        Fooditems takeAway = new Fooditems(7,11,25,50,40);
        HashMap<String,String> map= new HashMap<>();
        ArrayList<String> transactionList = new ArrayList<>();


        Scanner scanner =new Scanner(System.in);
        outer:while (true){

            System.out.println("Select Mode");
            System.out.println("1.Food");
            System.out.println("2.takeAway");
            System.out.println("3.View accounts");
            System.out.println("4.Exit");
            mode = scanner.nextInt();

            switch (mode){
                case 1:
                    while(true){

                        System.out.println("Enter the option");
                        System.out.println("1.Tea :"+Food.getTea());
                        System.out.println("2.Coffee "+Food.getCoffee());
                        System.out.println("3.Cake "+Food.getCake());
                        System.out.println("4.Sweets "+Food.getSweets());
                        System.out.println("5.Ice Cream "+Food.getIceCream());
                        System.out.println("6.BILL");
                        System.out.println("7.exit");
                        choice=scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (Food.getTea()* qty) + total;
                                break;
                            case 2:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (Food.getCoffee() * qty) + total;
                                break;
                            case 3:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (Food.getCake() * qty) + total;
                                break;
                            case 4:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (Food.getSweets() * qty) + total;
                                break;
                            case 5:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (Food.getIceCream() * qty) + total;
                                break;
                            case 6:
                                int random = ((int) (Math.random()*9000)+1000);
                                System.out.println("Enter your name");
                                name =scanner.next();
                                System.out.println("Total Bill :"+total);
                                map.put("name",name);
                                map.put("Amount",String.valueOf(total));
                                map.put("Invoice",String.valueOf(random));
                                map.put("mode","Food");
                                transactionList.add(String.valueOf(map));
                                break;
                            case 7:
                                continue outer;


                        }
                    }
                case 2:
                    while (true){

                        System.out.println("Enter the option");
                        System.out.println("1.Tea :"+takeAway.getTea());
                        System.out.println("2.Coffee "+takeAway.getCoffee());
                        System.out.println("3.Cake "+takeAway.getCake());
                        System.out.println("4.Sweets "+takeAway.getSweets());
                        System.out.println("5.Ice Cream "+takeAway.getIceCream());
                        System.out.println("6.BILL");
                        System.out.println("7.exit");
                        choice=scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (takeAway.getTea() * qty) + total;
                                break;
                            case 2:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (takeAway.getCoffee() * qty) + total;
                                break;
                            case 3:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (takeAway.getCake() * qty) + total;
                                break;
                            case 4:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (takeAway.getSweets() * qty) + total;
                                break;
                            case 5:
                                System.out.println("Enter quantity");
                                qty = scanner.nextInt();
                                total = (takeAway.getIceCream() * qty) + total;
                                break;
                            case 6:
                                int random = ((int) (Math.random()*9000)+1000);
                                System.out.println("Enter your name");
                                name =scanner.next();
                                System.out.println("Total Bill :"+total);
                                map.put("name",name);
                                map.put("Amount",String.valueOf(total));
                                map.put("Invoice",String.valueOf(random));
                                map.put("mode","take away");
                                transactionList.add(String.valueOf(map));
                                break;
                            case 7:
                                continue outer;

                        }
                    }
                case 3:
                    System.out.println("View accounts");
                    for (int i = 0; i < transactionList.size(); i++) {
                        System.out.println(transactionList.get(i));

                    }
                    break;
                default:
                    System.out.println("Invalid entry");

            }
        }


        }

    }

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Coffee Cafe");
        Scanner scn = new Scanner(System.in) ;
         CoffeeMachine coffeeMachine = new CoffeeMachine() ;
            while(true){
                System.out.println("1. Buy Coffee");
                System.out.println("2. Fill Ingredients");
                System.out.println("3. Take Money");
                System.out.println("4. Show Ingredients");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scn.nextInt(); ;

                switch (choice){
                    case 1 :
                        System.out.print("Enter coffee type (Espresso, Latte, Cappuccino): ");
                        String coffeeType = scn.next();
                        System.out.println(".....");
                        coffeeMachine.buyCoffee(coffeeType);
                        break;

                    case 2:
                        System.out.print("Enter amount of water to add (in ml): ");
                        int waterAmount = scn.nextInt();
                        System.out.print("Enter amount of milk to add (in ml): ");
                        int milkAmount = scn.nextInt();
                        System.out.print("Enter amount of coffee beans to add (in g): ");
                        int coffeeBeansAmount = scn.nextInt();
                        coffeeMachine.fillIngredients(waterAmount, milkAmount, coffeeBeansAmount);
                        break;

                    case 3 :
                          coffeeMachine.takeMoney();
                        break;

                    case 4:
                        coffeeMachine.showIngredients();
                        break;

                    case 5:
                        System.out.println("Exiting the coffee machine simulation.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                System.out.println();
            }
    }
}
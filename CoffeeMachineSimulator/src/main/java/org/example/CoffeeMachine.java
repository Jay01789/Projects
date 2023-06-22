package org.example;

public class CoffeeMachine {
    int milk ;
    int water ;
    int coffeeBeans;
    int moneyBox = 0 ;

    public CoffeeMachine(){
        milk = 0 ;
        water = 0 ;
        coffeeBeans  =0 ;
    }


    public void buyCoffee(String Type) {
        int price ;
        int waterNeeded ;
        int coffeeBeansNeeded ;
        int milkNeeded;

        switch (Type){
            case "Espresso":
                price = 4;
                waterNeeded = 250;
                milkNeeded = 0;
                coffeeBeansNeeded = 16;
                break;
            case "Latte":
                price = 7;
                waterNeeded = 350;
                milkNeeded = 75;
                coffeeBeansNeeded = 20;
                break;
            case "Cappuccino":
                price = 6;
                waterNeeded = 200;
                milkNeeded = 100;
                coffeeBeansNeeded = 12;
                break;
            default:
                System.out.println("Invalid coffee type.");
                return;
        }

        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded) {
            System.out.println("Dispensing coffee: " + Type);
            moneyBox += price;
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
        } else {
            System.out.println("Insufficient ingredients to make " + Type + " coffee.");
        }
    }

    public void fillIngredients(int waterAmount, int milkAmount, int coffeeBeansAmount) {
        water += waterAmount;
        milk += milkAmount;
        coffeeBeans += coffeeBeansAmount;
    }

    public void takeMoney() {
        System.out.println("Money collected: $" + moneyBox);
        moneyBox = 0;
    }

    public void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee Beans: " + coffeeBeans + " gms");
    }
}

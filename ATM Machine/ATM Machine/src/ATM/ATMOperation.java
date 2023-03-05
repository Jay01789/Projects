package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMOperation implements IATMOperation {
    ATM atm = new ATM();
    Map<Double,String> mini = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void checkBalance() {
        System.out.println("Available Balance : " + " " + atm.getBalance());
    }

    @Override
    public void withDraw() {
        System.out.println("Enter Amount : ");
        double amt = sc.nextDouble();
        if(amt <= atm.getBalance()){
            mini.put(amt , "has been withDrawn");
            atm.setBalance(atm.getBalance()-amt);
            System.out.println("Collect the Amount");


        }else {
            System.out.println("Insufficient Balance / Enter Valid Amount");
            withDraw();
        }
    }

    @Override
    public void depo(Double depositeAmount) {
        mini.put(depositeAmount , "Amount Deposited");
        atm.setBalance(atm.getBalance()+depositeAmount);
        System.out.println(depositeAmount + " " + "Deposited Sucessfully");

    }

    @Override
    public void getminiStatement() {
        for(Map.Entry<Double,String> m:mini.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());

        }

    }
}

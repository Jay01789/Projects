package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IATMOperation op = new ATMOperation();
        int UserName = 1232;
        int Password = 9845;

        System.out.println("Welcome to Alpha ATM MACHINE");
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter USERNAME");
        int user = in.nextInt();
        System.out.println("Please Enter PASSWORD");
        int password = in.nextInt();

        if(user == UserName && password == Password ){
            while (true){
                System.out.println("1.Check Account Balance" );
                System.out.println("2.Withdraw Amount" );
                System.out.println("3.Deposite Amount" );
                System.out.println("4.View Mini Statement" );
                System.out.println("5.Exit" );

                System.out.println("Please Enter your choice : " );

                int ch = in.nextInt();

                if(ch ==1){
                    op.checkBalance();

                } else if (ch == 2) {
                    op.withDraw();

                } else if (ch == 3) {
                    System.out.println("Enter the Amount to be Deposited : ");
                    Double depositeAmount = in.nextDouble();
                    op.depo(depositeAmount);

                } else if (ch == 4) {
                    op.getminiStatement();

                }else if (ch == 5){
                    System.out.println("Please Collect you CARD" );
                    System.out.println("Thank You for visiting Alpha ATM");
                    System.exit(0);

                }else {
                    System.out.println("Please Enter Valid Choice");
                }


            }

        }else{
            System.out.println("Please Enter Correct UserName or Password");
            System.exit(0);
        }



    }
}
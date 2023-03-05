package ATM;

public class ATM {
    public double balance = 100;
    public double withdrawAmount;

    public double depositedAmount;

    //default explicite Constructor
    public ATM(){}

    //Getters and Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositedAmount() {
        return depositedAmount;
    }

    public void setDepositedAmount(double depositedAmount) {
        this.depositedAmount = depositedAmount;
    }
}

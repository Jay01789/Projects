package ATM;

public interface IATMOperation {
    void checkBalance();

    void withDraw();

    void depo(Double depoamnt);

    void getminiStatement();
}

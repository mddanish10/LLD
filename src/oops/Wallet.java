package oops;

public class Wallet implements PayementMethod{
    String wallettNo;

    public Wallet(String wallettNo) {
        this.wallettNo = wallettNo;
    }

    @Override
    public void makePayment() {
        System.out.println("making payment via wallet"+wallettNo);
    }
}

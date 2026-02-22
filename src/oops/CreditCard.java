package oops;

public class CreditCard extends  Card {
    public CreditCard(String username, String cardNo) {
        super(username, cardNo);
    }



    @Override
    public void makePayment() {
        System.out.println("making payment via cc");
    }
}

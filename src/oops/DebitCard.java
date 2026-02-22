package oops;

public class DebitCard extends Card {
    public DebitCard(String username, String cardNo) {
        super(username, cardNo);
    }

    @Override
    public void makePayment() {
        System.out.println("making payment via dc");
    }
}

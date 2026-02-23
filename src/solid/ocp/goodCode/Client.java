package solid.ocp.goodCode;

public class Client {

    static void main() {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethod creditcard= new CreditCard();
        PaymentMethod upi = new UPI();
        PaymentMethod wallet = new Wallet();
        paymentProcessor.processPayment(creditcard,100);
        paymentProcessor.processPayment(upi,200);
        paymentProcessor.processPayment(wallet,300);
    }
}

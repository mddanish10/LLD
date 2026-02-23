package solid.ocp.goodCode;

public class PaymentProcessor {

    public void processPayment( PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}

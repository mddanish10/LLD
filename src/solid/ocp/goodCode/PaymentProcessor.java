package solid.ocp.goodCode;

public class PaymentProcessor {

    public void processPayment( PaymentMethod paymentMethod, double ammount){
        paymentMethod.pay();
    }
}

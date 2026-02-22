package oops;

public class Client {
    static void main() {

        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("danihsDC",new DebitCard("danish","123dc"));
        paymentService.addPaymentMethod("danihsCC",new CreditCard("danish","123cc"));
        paymentService.addPaymentMethod("danihsWallet",new Wallet("123"));

        paymentService.makePay("danihsDC");
        paymentService.makePay("danihsCC");
        paymentService.makePay("danihsWallet");
    }
}

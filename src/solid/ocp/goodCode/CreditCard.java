package solid.ocp.goodCode;

public class CreditCard implements PaymentMethod{


    @Override
    public void pay( double ammount) {
        System.out.println("this payment is through CreditCard"+ammount);
    }
}

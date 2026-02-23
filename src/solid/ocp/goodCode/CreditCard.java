package solid.ocp.goodCode;

public class CreditCard implements PaymentMethod{


    @Override
    public void pay() {
        System.out.println("this payment is through CreditCard");
    }
}

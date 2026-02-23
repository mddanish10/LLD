package solid.ocp.goodCode;

public class UPI implements  PaymentMethod{
    @Override
    public void pay() {

            System.out.println("this payment is through UPI");

    }
}

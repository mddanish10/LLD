package solid.ocp.goodCode;

public class Wallet implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("this payment through wallet");
    }
}

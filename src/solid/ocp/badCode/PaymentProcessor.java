package solid.ocp.badCode;

public class PaymentProcessor {


    public void processPayment(double ammount, String paymentMethod) {
         if(paymentMethod.equals("creditCard")){
             System.out.println("payment Through creditCard");
         }
         else if (paymentMethod.equals("debitCard")) {
             System.out.println("payment Through debitCard");
         } else if (paymentMethod.equals("randomMethod")){
             System.out.println("payment though randomMethod");

         }
         else {
             throw new IllegalArgumentException("unsupported method"+paymentMethod);
         }
    }
}

// this code is open for modification but not for extension and is tightly coupled, if we want to implement new payment method
// say UPI then we need to make changes in Payment Processor which is actually not a good practice.


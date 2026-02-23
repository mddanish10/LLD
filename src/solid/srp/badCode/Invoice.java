package solid.srp.badCode;

public class Invoice {

  private   double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }
    public  void saveInvoiceDb(){
        System.out.println("this method is to save the invoice to database");
    }

    public void sendEmail(){
        System.out.println("this method is to send the mail");
    }

}

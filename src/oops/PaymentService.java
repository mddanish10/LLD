package oops;

import java.util.HashMap;

public class PaymentService {


    HashMap<String, PayementMethod> pms;

  PaymentService() {
        pms= new HashMap<>();
    }

    public  void addPaymentMethod(String name, PayementMethod pm){
      pms.put(name,pm);

    }
    public  void  makePay(String name){
      PayementMethod pay = pms.get(name);
      pay.makePayment();
    }
}

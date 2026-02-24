package solid.isp.goodCode;

public class MultiPurposeMachine implements Scanner,Printer,PhotoCopy{
    @Override
    public void photo() {
        System.out.println("This machine is design for PhotCopy");
    }

    @Override
    public void print() {
        System.out.println("This machine is design for Printing");
    }

    @Override
    public void scan() {
        System.out.println("This machine is design for Scanning");
    }
}
//In this package we have design interface more specifically which is a good practice and adhere to ISP
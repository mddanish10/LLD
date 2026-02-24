package solid.isp.badCode;

public class Print implements Printer {
    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("this Machine is not for Scan");
    }

    @Override
    public void print(Document doc) {
        System.out.println("This machine is for printing");

    }

    @Override
    public void Copy(Document doc) {

        throw new UnsupportedOperationException("this Machine is not for photoCopy");
    }
}


//This Class is design only for Printing but since it is implementing Printing it has implemented the other method as well
//which was not needed and this is the classic example where we  are not adhere to ISP. We should define interface into more specific one.
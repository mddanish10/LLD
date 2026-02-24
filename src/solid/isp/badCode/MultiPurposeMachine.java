package solid.isp.badCode;

public class MultiPurposeMachine implements Printer{
    @Override
    public void scan(Document doc) {
        System.out.println("this is scan Machine");
    }

    @Override
    public void print(Document doc) {
        System.out.println("this is print Machine");
    }

    @Override
    public void Copy(Document doc) {
        System.out.println("this is photoCopy Machine");
    }
}

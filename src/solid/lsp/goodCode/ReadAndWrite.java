package solid.lsp.goodCode;

public class ReadAndWrite extends ReadOnly implements Writable{


    @Override
    public void write() {
        System.out.println("this is write method inside ReadAndWrite");
    }
}

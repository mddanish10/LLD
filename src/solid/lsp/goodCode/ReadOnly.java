package solid.lsp.goodCode;

public class ReadOnly implements Readable{
    @Override
    public void read() {
        System.out.println("this is readonly method");
    }
}

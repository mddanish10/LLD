package solid.lsp.badCode;

public class ReadOnly extends File{
    @Override
    public void writeOnly() {
       throw new UnsupportedOperationException("Write is not possible in ReadOnly");
    }
}

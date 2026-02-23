package solid.lsp.badCode;

public class Client {

    static void main() {
        File file = new ReadOnly();
        file.readOnly();
        file.writeOnly();//it will give exepction as this should not be allowed, this is not adhere to LSP
    }

}

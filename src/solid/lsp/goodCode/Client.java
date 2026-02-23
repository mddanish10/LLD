package solid.lsp.goodCode;

public class Client {

    public static void readAnyFile(ReadOnly readOnly){
        readOnly.read();
    }

    static void main() {
        ReadOnly readable = new ReadableFile();
        readable.read();
       // readable.

        ReadAndWrite readAndWrite = new ReadAndWrite();
        readAndWrite.write();
        readAndWrite.read();

      readAnyFile(readable);
      readAnyFile(readAndWrite);

    }
}

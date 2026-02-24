package solid.isp.goodCode;

public class PhotoPrint implements PhotoCopy,Printer{
    @Override
    public void photo() {
        System.out.println("This machine is design for PhotCopy");
    }

    @Override
    public void print() {
        System.out.println("This machine is design for printing");
    }
}

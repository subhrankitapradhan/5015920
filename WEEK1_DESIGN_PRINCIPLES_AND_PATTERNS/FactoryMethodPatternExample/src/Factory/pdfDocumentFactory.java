package Factory;

public class pdfDocumentFactory extends documentFactory {
    @Override
    public Document createDocument() {
        return new pdfDocument();
    }
}

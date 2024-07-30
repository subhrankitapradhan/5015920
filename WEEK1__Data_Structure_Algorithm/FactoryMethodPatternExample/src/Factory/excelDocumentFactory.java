package Factory;

public class excelDocumentFactory extends documentFactory {
    @Override
    public Document createDocument() {
        return new excelDocument();
    }
}

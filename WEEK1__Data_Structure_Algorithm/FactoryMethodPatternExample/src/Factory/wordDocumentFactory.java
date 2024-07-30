package Factory;

public class wordDocumentFactory extends documentFactory {
    @Override
    public Document createDocument() {
        return new wordDocument();
    }
}
package Factory;


public class factoryMethodTest {
    public static void main(String[] args) {
        // Create a Word document using the factory method
        documentFactory wordFactory = new wordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();
        wordDocument.save();
        wordDocument.close();
        
        // Create a PDF document using the factory method
        documentFactory pdfFactory = new pdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();
        
        // Create an Excel document using the factory method
        documentFactory excelFactory = new excelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
        excelDocument.save();
        excelDocument.close();
    }
}

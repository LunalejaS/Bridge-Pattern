package Implements.FormatExporter;

public class PDFExporter implements FormatExporter {
    @Override
    public void export(String content) {
        System.out.println("[PDF] Exporting: " + content);
    }
    
}
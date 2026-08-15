package Implements.FormatExporter;

public class JSONExporter implements FormatExporter {
    @Override
    public void export(String content) {
        System.out.println("[JSON] Exporting: " + content);
    }
    
}
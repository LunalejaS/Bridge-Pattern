package Implements.FormatExporter;

public class EDIExporter implements FormatExporter {
    @Override
    public void export(String content) {
        System.out.println("EDI Exported Content: " + content);
    }  
}

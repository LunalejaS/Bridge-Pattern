package Implements.FormatExporter;

public class XMLExporter implements FormatExporter {
    @Override
    public void export(String content) {
        System.out.println("[XML] Exporting: " + content);
    }
}
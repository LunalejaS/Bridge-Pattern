import Implements.FormatExporter.*;
import Implements.SendingChannel.*;
import Implements.SignatureProvider.*;
import Abstract.*;



public class Main {

    public static void main(String[] args) {

        Voucher voucher1 = new SalesInvoice(
                new XMLExporter(),
                new EmailChannel(),
                new LocalSignature()
        );

        Voucher voucher2 = new CreditNote(
                new PDFExporter(),
                new WhatsAppChannel(),
                new CloudSignature()
        );

        Voucher voucher3 = new DebitNote(
                new JSONExporter(),
                new WebPortalChannel(),
                new HSMProvider()
        );

        Voucher voucher4 = new WithholdingCertificate(
                new XMLExporter(),
                new WhatsAppChannel(),
                new CloudSignature()
        );

        Voucher voucher5 = new SalesInvoice(
                new PDFExporter(),
                new WebPortalChannel(),
                new HSMProvider()
        );

        Voucher voucher6 = new CreditNote(
                new EDIExporter(),
                new EmailChannel(),
                new LocalSignature()
        );

        System.out.println("=== Voucher 1 ===");
        voucher1.process();

        System.out.println("\n=== Voucher 2 ===");
        voucher2.process();

        System.out.println("\n=== Voucher 3 ===");
        voucher3.process();

        System.out.println("\n=== Voucher 4 ===");
        voucher4.process();

        System.out.println("\n=== Voucher 5 ===");
        voucher5.process();

        System.out.println("\n=== Voucher 6 - EDI Extension ===");
        voucher6.process();
    }
}

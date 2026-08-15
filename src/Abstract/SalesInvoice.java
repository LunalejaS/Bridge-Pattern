package Abstract;

import Implements.FormatExporter.FormatExporter;
import Implements.SendingChannel.SendingChannel;
import Implements.SignatureProvider.SignatureProvider;

public class SalesInvoice extends Voucher {
    
    public SalesInvoice(FormatExporter formatExporter, SendingChannel sendingChannel, SignatureProvider signatureProvider) {
        super(formatExporter, sendingChannel, signatureProvider);
    }

    @Override
    public String buildContent() {
        return "Sales Invoice #001 - Total: 150000";
    }
    
}
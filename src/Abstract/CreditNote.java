package Abstract;

import Implements.FormatExporter.FormatExporter;
import Implements.SendingChannel.SendingChannel;
import Implements.SignatureProvider.SignatureProvider;

public class CreditNote extends Voucher {
    
    public CreditNote(FormatExporter formatExporter, SendingChannel sendingChannel, SignatureProvider signatureProvider) {
        super(formatExporter, sendingChannel, signatureProvider);
    }

    @Override
    public String buildContent() {
        return "Credit Note #002 - Total: 50000";
    }
}
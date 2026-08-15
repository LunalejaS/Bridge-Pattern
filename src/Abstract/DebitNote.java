package Abstract;

import Implements.FormatExporter.FormatExporter;
import Implements.SendingChannel.SendingChannel;
import Implements.SignatureProvider.SignatureProvider;

public class DebitNote extends Voucher {

    public DebitNote(FormatExporter formatExporter, SendingChannel sendingChannel, SignatureProvider signatureProvider) {
        super(formatExporter, sendingChannel, signatureProvider);
    }

    @Override
    public String buildContent() {
        return "Debit Note #003 - Total: 75000";
    }
    
}
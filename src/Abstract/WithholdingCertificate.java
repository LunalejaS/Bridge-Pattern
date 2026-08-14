package Abstract;

import Implements.FormatExporter.FormatExporter;
import Implements.SendingChannel.SendingChannel;
import Implements.SignatureProvider.SignatureProvider;

public class WithholdingCertificate extends Voucher {
    
    public WithholdingCertificate(FormatExporter formatExporter, SendingChannel sendingChannel, SignatureProvider signatureProvider) {
        super(formatExporter, sendingChannel, signatureProvider);
    }

    @Override
    public String buildContent() {
        return "Withholding Certificate #004 - Total: 30000";
    }
    
}
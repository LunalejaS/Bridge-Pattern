package Abstract;

import Implements.FormatExporter.FormatExporter;
import Implements.SendingChannel.SendingChannel;
import Implements.SignatureProvider.SignatureProvider;

public abstract class Voucher {
    
    protected FormatExporter formatExporter;
    protected SendingChannel sendingChannel;
    protected SignatureProvider signatureProvider;

    public Voucher(FormatExporter formatExporter, SendingChannel sendingChannel, SignatureProvider signatureProvider) {
        this.formatExporter = formatExporter;
        this.sendingChannel = sendingChannel;
        this.signatureProvider = signatureProvider;
    }

    public abstract String buildContent();

    public void process() {
        String content = buildContent();
        signatureProvider.sign(content);
        formatExporter.export(content);
        sendingChannel.send(content);
    }

}
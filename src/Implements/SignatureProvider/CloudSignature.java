package Implements.SignatureProvider;

public class CloudSignature implements SignatureProvider {
    @Override
    public void sign(String content) {
        System.out.println("[CLOUD SIGNATURE] Signing: " + content);
    }
}
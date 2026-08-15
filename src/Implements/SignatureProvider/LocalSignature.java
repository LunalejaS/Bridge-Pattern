package Implements.SignatureProvider;

public class LocalSignature implements SignatureProvider {
    @Override
    public void sign(String content) {
        System.out.println("[LOCAL SIGNATURE] Signing: " + content);
    }
}
package Implements.SignatureProvider;

public class HSMProvider implements SignatureProvider {
    @Override
    public void sign(String content) {
        System.out.println("[HSM] Signing: " + content);
    }  
}
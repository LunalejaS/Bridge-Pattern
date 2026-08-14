package Implements.SendingChannel;

public class WhatsAppChannel implements SendingChannel {
    @Override
    public void send(String message) {
        System.out.println("[WHATSAPP] Sending: " + message);
    }
    
}
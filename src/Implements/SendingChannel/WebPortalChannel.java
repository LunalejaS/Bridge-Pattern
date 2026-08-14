package Implements.SendingChannel;

public class WebPortalChannel implements SendingChannel {
    @Override
    public void send(String message) {
        System.out.println("[WEB PORTAL] Sending: " + message);
    }
}
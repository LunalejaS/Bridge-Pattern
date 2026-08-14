package Implements.SendingChannel;

public class EmailChannel implements SendingChannel {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] Sending: " + message);
    }
}
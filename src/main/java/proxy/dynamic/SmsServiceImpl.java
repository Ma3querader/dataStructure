package proxy.dynamic;

public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }

    @Override
    public void call() {
        System.out.println("call...");
    }
}
package proxy.dynamic;

public interface SmsService {
    String send(String message);

    void call();
}
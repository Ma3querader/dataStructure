package proxy.stati;

/**
 * @Author: panyusheng
 * @Date: 2021/6/29
 * @Version 1.0
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}

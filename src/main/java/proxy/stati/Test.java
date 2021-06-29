package proxy.stati;

/**
 * @Author: panyusheng
 * @Date: 2021/6/29
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("吃屎啦");
    }
}

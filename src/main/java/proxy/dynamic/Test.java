package proxy.dynamic;

/**
 * @Author: panyusheng
 * @Date: 2021/6/29
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
        smsService.call();
    }
}

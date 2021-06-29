package proxy.stati;

/**
 * @Author: panyusheng
 * @Date: 2021/6/29
 * @Version 1.0
 */
public class SmsProxy implements SmsService{
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("调用前...");
        smsService.send(message);
        System.out.println("调用后...");
        return null;
    }
}

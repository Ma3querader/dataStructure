package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: panyusheng
 * @Date: 2021/6/29
 * @Version 1.0
 *
 * jdk动态代理类
 */
public class SmsServiceInvocationHandler implements InvocationHandler {
    private final Object target;

    public SmsServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");
        Object result = method.invoke(target, args);
        System.out.println("调用后");
        return result;
    }
}

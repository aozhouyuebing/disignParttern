package top.greatxiaozou.proxy.dynamicProxy;

/**
 * 具体的前置通知类
 */
public class BeforeAdvice implements IAdvice {

    public void exec() {
        System.out.println("前置执行");
    }
}

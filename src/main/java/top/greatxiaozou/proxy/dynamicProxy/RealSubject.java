package top.greatxiaozou.proxy.dynamicProxy;

/**
 * 动态代理中的真实主题类
 */
public class RealSubject implements Subject{
    public void doSomething(String str) {
        System.out.println("doSomething---"+str);
    }
}

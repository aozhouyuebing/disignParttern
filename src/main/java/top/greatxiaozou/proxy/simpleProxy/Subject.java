package top.greatxiaozou.proxy.simpleProxy;

/**
 * 简单代理模式的抽象主题接口，真实对象和代理对象都需要实现该接口
 *
 */
public interface Subject {
    //业务方法
    void request();
}

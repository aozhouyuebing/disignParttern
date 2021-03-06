package top.greatxiaozou.proxy.simpleProxy;

/**
 * 代理类，静态代理的核心类
 */
public class Proxy implements Subject {
    //创建一个真实对象
    private RealSubject realSubject = new RealSubject();


    //代理方法
    public void request() {
        this.before();  //前置增强
        this.realSubject.request();
        this.after(); //后置增强
        return;//如果有返回值的话返回
    }

    //前置增强
    public void before(){
        //前置增强方法
    }

    //后置增强
    public void after(){
        //后置增强方法
    }
}

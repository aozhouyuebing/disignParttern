package top.greatxiaozou.mediator;

/**
 * 中介者模式中的抽象中介者
 */
public abstract class Mediator {
    protected ConcreteColleaguel c1;
    protected ConcreteColleague2 c2;

    public ConcreteColleaguel getC1(){
        return c1;
    }

    public ConcreteColleaguel getC2(){
        return c2;
    }
    //中介者的业务逻辑
    public abstract void doSomething1();
    public abstract void doSomething2();
}

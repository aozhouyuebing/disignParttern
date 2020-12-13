package top.greatxiaozou.command;

/**
 * 命令模式中的抽象接收者
 */
public abstract class Receiver {
    //定义每个接收者都需要完成的业务
    public abstract void doSomething();
}

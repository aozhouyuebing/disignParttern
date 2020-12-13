package top.greatxiaozou.command;

/**
 * 具体的命令类
 * 可以根据实际业务情况扩展
 */
public class ConcreteCommand1 extends Command {
    //应当由哪个接收者来处理命令
    private Receiver receiver;

    //通过构造来注入接收者
    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    //通过接收者来处理命令
    public void execute() {
        this.receiver.doSomething();
    }
}

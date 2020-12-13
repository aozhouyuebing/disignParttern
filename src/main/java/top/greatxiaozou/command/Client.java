package top.greatxiaozou.command;

/**
 * 场景类，描述如何使用命令模式
 */
public class Client {
    public static void main(String[] args) {
        //调用者类
        Invoker invoker = new Invoker();
        //接受者类
        Receiver reciver1 = new ConcreteReciver1();
        //命令类，传入该命令的处理者
        Command command = new ConcreteCommand1(reciver1);
        //设置命令并调用
        invoker.setCommand(command);
        invoker.action();

    }
}

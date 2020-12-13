package top.greatxiaozou.command;

/**
 * 命令模式中的调用者
 * 负责传递命令和接收者
 */
public class Invoker {
    private Command command;

    //通过set方法注入命令对象
    public void setCommand(Command command) {
        this.command = command;
    }

    //命令执行
    public void action(){
        command.execute();
    }
}

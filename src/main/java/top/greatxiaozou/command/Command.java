package top.greatxiaozou.command;

/**
 * 抽象的命令类
 */
public abstract class Command {
    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}

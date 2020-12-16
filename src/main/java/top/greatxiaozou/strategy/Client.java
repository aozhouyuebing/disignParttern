package top.greatxiaozou.strategy;

/**
 * 策略模式的场景类
 */
public class Client {
    public static void main(String[] args) {
        //构造策略对象
        Strategy strategy1 = new ConcreteStrategy1();
        //构造上下文对象
        Context context = new Context(strategy1);

        //使用策略方法
        context.doSomething();
    }
}

package top.greatxiaozou.strategy;

/**
 * 上下文类，复杂封装策略类，对高层模块隐藏算法的具体实现
 */
public class Context {
    //策略类
    private Strategy strategy;

    //构造函数注入
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //通过具体的策略来实行
    public void doSomething(){
        this.strategy.doSomething();
    }
}

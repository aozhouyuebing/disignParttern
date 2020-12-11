package top.greatxiaozou.template;

/**
 * 模板模式中的抽象模板
 */
public abstract class AbstractClass {
    //未实现的基本方法
    protected abstract void doSomething();
    protected abstract void doAnything();

    //模板方法
    public void templateMethod(){
        //调用基本方法完成相关逻辑
        this.doAnything();
        this.doSomething();
    }
}

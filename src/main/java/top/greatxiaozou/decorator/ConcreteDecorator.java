package top.greatxiaozou.decorator;

/**
 * 具体的装饰类，是装饰器模式的核心
 */
public class ConcreteDecorator extends Decorator {
    //实现父类的构造
    public ConcreteDecorator(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    public void before(){
        //前置修饰
    }
    public void after(){
        //后置修饰
    }

    //装饰器中重写操作方法
    @Override
    public void operate() {
        before();
        super.operate();
        after();
    }
}

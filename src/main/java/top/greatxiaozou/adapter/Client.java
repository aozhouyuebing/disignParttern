package top.greatxiaozou.adapter;

/**
 * 场景类，描述适配器模式的使用场景
 */
public class Client {
    public static void main(String[] args) {
        //原逻辑
        Target t1 = new ConcreteTarget();
        t1.request();

        //新逻辑
        Target t2 = new Adapter();
        t2.request();
    }
}

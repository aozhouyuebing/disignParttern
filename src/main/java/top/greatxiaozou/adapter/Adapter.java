package top.greatxiaozou.adapter;

/**
 * 适配器模式的核心角色
 * 继承源角色，实现目标角色的接口，使得高层模块调用目标角色时
 * 只需要使用适配器对象即可
 */
public class Adapter extends Adaptee implements Target {
    //
    public void request() {
        super.doSomething();
    }
}

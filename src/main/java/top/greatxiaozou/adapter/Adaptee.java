package top.greatxiaozou.adapter;

/**
 * 源角色，是不能改变的角色
 * 需要用适配器来适配目标角色，实现和源角色一样的操作
 */
public class Adaptee {
    public void doSomething(){
        //已有的业务逻辑，尽量不做修改的部分
    }
}

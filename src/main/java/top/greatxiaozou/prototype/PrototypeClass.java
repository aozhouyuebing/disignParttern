package top.greatxiaozou.prototype;

/**
 * 原型模式的原型类,使用时在场景类中使用clone方法获取副本，然后通过get/set方法来细化
 */
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        return (PrototypeClass) super.clone();
    }
}

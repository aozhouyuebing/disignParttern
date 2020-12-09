package top.greatxiaozou.factory;

/**
 * 工厂的一层抽象，将工厂需要实现的方法抽象到Creator中
 */
public abstract class Creator {
    //定义产品的制造方法，传入一个带泛型的反射类，返回值为该反射的原始类
    public abstract <T extends Product> T createProduct(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}

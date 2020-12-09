package top.greatxiaozou.factory;

/**
 * 具体工厂的实现
 */
public class ConcreteCreator extends Creator {
    //通过反射获取实例对象并返回，达到通过工厂创造实例的目的
    public <T extends Product> T createProduct(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Product product = (Product) Class.forName(c.getName()).newInstance();

        return (T)product;
    }
}

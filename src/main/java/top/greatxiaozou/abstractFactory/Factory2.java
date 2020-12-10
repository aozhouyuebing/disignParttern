package top.greatxiaozou.abstractFactory;

/**
 * 工厂2只生产2系的产品，AB都生产
 */
public class Factory2 extends AbstractFactory {

    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}

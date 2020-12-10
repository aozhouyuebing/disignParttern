package top.greatxiaozou.abstractFactory;

/**
 * 工厂1只生产1类型的产品，AB都产
 */
public class Factory1 extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

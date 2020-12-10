package top.greatxiaozou.abstractFactory;

public abstract class AbstractFactory {
    //工厂可以创建产品A
    public abstract AbstractProductA createProductA();

    //也可以创建产品B
    public abstract AbstractProductB createProductB();
}

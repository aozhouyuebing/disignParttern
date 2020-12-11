package top.greatxiaozou.builder;

/**
 * 抽象建造者，需要被实现
 */
public abstract class Builder {
    //设置产品的不同组成以获得不同产品
    public abstract void setPart();

    //建造产品的方法
    public abstract Product buildProduct();
}

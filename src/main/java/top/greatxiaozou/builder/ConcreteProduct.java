package top.greatxiaozou.builder;

/**
 * 具体建造者类，继承并实现了抽象建造者
 */
public class ConcreteProduct extends Builder{
    private Product product = new Product();
    public void setPart() {
        //处理产品的组成
    }

    public Product buildProduct() {
        return product;
    }
}

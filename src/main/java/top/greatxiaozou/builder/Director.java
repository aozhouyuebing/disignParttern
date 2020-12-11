package top.greatxiaozou.builder;

import java.util.HashSet;

/**
 * 建造者中导演类
 * 导演类起到封装建造者的作用，避免高层模块深入建造者内部实现类
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getProduct(){
        builder.setPart();

        return builder.buildProduct();
    }

}

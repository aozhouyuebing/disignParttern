package top.greatxiaozou.singleton;

/**
 * 饿汉式单例模式
 * 使用最广泛的单例模式
 */
public class Singleton01 {
    private static Singleton01 instance = new Singleton01();
    private Singleton01(){}

    public static Singleton01 getInstance(){
        return instance;
    }
}

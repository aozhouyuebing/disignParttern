package top.greatxiaozou.singleton;

/**
 * 简单的懒汉式单例，线程不安全
 */
public class Singleton02 {
    private static Singleton02 instance;
    private Singleton02(){}

    public static Singleton02 getInstance(){
        if (instance == null){
            instance = new Singleton02();
        }
        return instance;
    }
}

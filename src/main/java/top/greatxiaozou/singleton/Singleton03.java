package top.greatxiaozou.singleton;

/**
 * DCL双锁校验式单例模式
 * 比较安全的懒汉式单例
 */

public class Singleton03 {
    private static volatile Singleton03 instance;

    private Singleton03(){}

    public static Singleton03 getInstance(){
        if (instance == null){
            synchronized (instance){
                if (instance == null){
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}

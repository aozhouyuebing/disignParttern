package top.greatxiaozou.singleton;

/**
 * 枚举类单例，可以防止反射破坏
 */
public enum Singleton05 {
    INSTANCE;
    public static Singleton05 getInstance(){
        return INSTANCE;
    }
}

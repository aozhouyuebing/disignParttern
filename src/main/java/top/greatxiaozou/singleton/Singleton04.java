package top.greatxiaozou.singleton;

/**
 * 静态内部类单例
 */
public class Singleton04 {

    private Singleton04(){}

    static class InstanceHolder{
        private static Singleton04 instance = new Singleton04();

        public static Singleton04 getInstance(){
            return instance;
        }
    }

}

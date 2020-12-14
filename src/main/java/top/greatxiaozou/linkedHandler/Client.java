package top.greatxiaozou.linkedHandler;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        //责任链设置
        handler1.setNext(handler2);
        //提交请求并获取结果
        Response response = handler1.handleMessage(new Request());

    }
}

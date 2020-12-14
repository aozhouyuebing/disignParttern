package top.greatxiaozou.linkedHandler;

/**
 * 具体处理器实现1
 */
public class ConcreteHandler1 extends Handler {
    protected String getHandlerLevel() {
        //获取自己的处理等级
        return null;
    }

    protected Response echo(Request request) {
        //具体处理器的处理规则
        return null;
    }
}

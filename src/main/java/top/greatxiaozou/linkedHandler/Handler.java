package top.greatxiaozou.linkedHandler;
/**
 * 责任链模式的处理器抽象，一般会有多个实现类
 */
public abstract class Handler {
    //定义下一个处理器
    private Handler nextHandler;
    public final Response handleMessage(Request request){
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())){
            //由该处理器处理请求
            response = this.echo(request);
        }else{
            if(this.nextHandler != null){
                //交给下一个处理器处理
                this.nextHandler.handleMessage(request);
            }else {
                //默认的处理
            }
        }
        return response;
    }

    public void setNext(Handler next){
        this.nextHandler = next;
    }
    //每个具体的处理器实现类都应当实现处理等级的获取
    protected abstract String getHandlerLevel();
    //每个具体处理器对请求的实现
    protected abstract Response echo(Request request);
}

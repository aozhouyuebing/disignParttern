package top.greatxiaozou.mediator;

/**
 * 抽象的同事类
 */
public abstract class Colleague {
    protected Mediator mediator;
    //规定一个构造
    public Colleague(Mediator _mediator){
        this.mediator = _mediator;
    }
}

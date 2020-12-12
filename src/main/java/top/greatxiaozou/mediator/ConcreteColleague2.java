package top.greatxiaozou.mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }

    //自有的业务逻辑处理方法
    public void selfMethod1(){
        //自己的业务逻辑处理
    }
    public void selfMethod2(){
        //自己的业务逻辑处理
    }

    //依赖方法
    public void deptMethod(){
        super.mediator.doSomething2();
    }
}

package top.greatxiaozou.mediator;

public class ConcreteMediator extends Mediator {
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod1();
    }

    public void doSomething2() {
        super.c1.selfMethod2();
        super.c2.selfMethod2();
    }
}

package top.greatxiaozou.decorator;

/**
 * 装饰器类的抽象，与具体需要被修饰的组件类继承或实现同一个抽象
 */
public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operate() {
        this.component.operate();
    }

}

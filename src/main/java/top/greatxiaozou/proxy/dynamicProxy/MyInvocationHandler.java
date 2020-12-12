package top.greatxiaozou.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理中的重点，方法的调用处理器
 * 由于动态代理是在运行期间生成代理对象，所有需要用到反射包中的InvocationHandler接口
 */
public class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null;

    //构造函数注入对象
    private MyInvocationHandler(Object _obj){
        this.target = _obj;
    }

    //所有通过动态代理实现的方法全部通过invoke方法调用
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}

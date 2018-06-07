package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IHello {
    void say(String s);
}

class RealHello implements IHello{
    @Override
    public void say(String s) {
        System.out.println("hello" + s);
    }
}

class HelloDelegate implements InvocationHandler{

    private IHello target;

    public void HelloProxy(IHello target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before print");
        method.invoke(target,args);
        System.out.println("after print");
        return null;
    }
}

public class DynamicProxy{

    public static void  main(String [] args){
        IHello iHello =
    }


    public static IHello enchanceHello(IHello target){
        return (IHello) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),new Class<?>[]{IHello.class}, new HelloDelegate(target));
    }
}
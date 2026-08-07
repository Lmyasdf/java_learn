package max.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static StarService createProxy(Star s){
        //参数一：类加载器，当前代理类的类加载器
        //参数二：接口数组，当前代理类实现的接口
        //参数三：InvocationHandler对象，执行方法调用时调用
        StarService proxy = (StarService) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                s.getClass().getInterfaces(),
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //参数一：代理对象本身
                        //参数二：正在被代理的方法
                        //参数三：正在被代理的方法的参数
                        String methodName = method.getName();
                        if("sing".equals(methodName)){
                            System.out.println("准备话筒");
                        }
                        else if("dance".equals(methodName)){
                            System.out.println("准备场地");
                        }
                        //叫被代理对象执行method方法
                        Object result = method.invoke(s,args);//反射，调用方法用一个Object来接，处理有返回值情况
                        return result;
                    }
                }
        );
        return proxy;
    }
}

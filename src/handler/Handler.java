package handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Handler implements InvocationHandler {

private Object object;
private String sex;


public Handler(Object object,String sex){
    this.object=object;
    this.sex=sex;

}

public Object bunding(){


    return Proxy.newProxyInstance(this.object.getClass().getClassLoader(),this.object.getClass().getInterfaces(),this);
}




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

String string=(String) method.invoke(object,"凹凸曼");

string="姓名:"+string+",性别:"+sex;

return string;



    }
}

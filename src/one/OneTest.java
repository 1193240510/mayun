package one;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class OneTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass=Class.forName("java.lang.String");
        System.out.println(aClass.getName());
        Field[] field=aClass.getDeclaredFields();
        for (Field field1:field){
            System.out.println("属性:"+field1.getName());

        }

        Method[] method=aClass.getMethods();
        for (Method method1:method){

           if (method1.getName().contains("get")){

               System.out.println(method1);
           }

        }
    }

}

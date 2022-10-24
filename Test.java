package demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {

            //生成Class对象
            Class<?> c = Class.forName("demo3.Student");
            //通过反射创建一个对象
            Student student2 = (Student) c.newInstance();
            //调用构造方法
            Constructor<?> constructor =  c.getDeclaredConstructor(int.class, String.class);
            //修改权限
            constructor.setAccessible(true);
            //实例化对象
            Student student1 = (Student)constructor.newInstance(21, "wuhao");
            System.out.println(student1);

            //反射成员属性
            Field field = c.getDeclaredField("name");
            //修改权限
            field.setAccessible(true);
            //实例化对象
            Student student3 = (Student) c.newInstance();
            //修改属性
            field.set(student3, "qq");
            //获取属性
            String name = (String) field.get(student3);
            System.out.println(name);

            //反射成员方法
            Method method = c.getDeclaredMethod("function", String.class);
            //获取方法名
            System.out.println(method.getName());
            //修改权限
            method.setAccessible(true);
            //实例化对象
            Student student4 = (Student) c.newInstance();
            //给方法传参
            method.invoke(student4, "ttt");




        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

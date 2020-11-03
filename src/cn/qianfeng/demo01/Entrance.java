package cn.qianfeng.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;

public class Entrance {
    public static void main(String[] args) throws Exception{
      //  Class stucls01 = Student.class;
        // 获取字节码文件方式
        Class stucls02 =Class.forName("cn.qianfeng.demo01.SQlServer");

     //   Class stucls03 =new Student().getClass();

     //   Object obj1 = stucls02.newInstance();

        Constructor constructor =stucls02.getDeclaredConstructor(String.class);

        constructor.setAccessible(true);
        Object instance= constructor.newInstance("刘义");
        System.out.println(instance);

        Class clazz = String.class;
        System.out.println(clazz);
        //获取一个类的构造函数，直接获取方法
       /* Method[] methods = stucls02.getMethods();
        //遍历
        for (Method m:
        methods){
            System.out.println(m);
        }*/
       Method meth = stucls02.getDeclaredMethod("executeSQL", String.class);

       meth.invoke(stucls02.newInstance(),"update table set fields = value where id = 1");

        Random random = new Random();

        for (int j = 0;j<10;j++){
            int i = random.nextInt(90)+10;
            System.out.println(i);
        }
    }
}

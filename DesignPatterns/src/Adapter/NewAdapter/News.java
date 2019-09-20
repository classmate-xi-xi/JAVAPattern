package Adapter.NewAdapter;

import Adapter.ClassAdapter.Clazz;
import Adapter.ClassAdapter.Clazzs;

//对象适配器
//希望将一个对象转换成满足另一个新接口的对象时，可以创建一个xxx类，持有原类的一个实例，在xxx类的方法中，调用实例的方法就行。
public class News extends Clazz implements Clazzs {
    private Clazz clazz;
    public News(Clazz clazz){
        super();
        this.clazz=clazz;
    }

    @Override
    public void method() {
        clazz.method();
    }
    public void method1() {
        System.out.println("这是一个类方法1");
    }

    public static void main(String[] args) {
        Clazz clazz1 = new Clazz();
        Clazzs clazzs = new News(clazz1);
        clazzs.method();
        clazzs.method1();
    }
}

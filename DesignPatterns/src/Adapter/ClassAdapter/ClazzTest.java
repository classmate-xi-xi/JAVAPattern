package Adapter.ClassAdapter;

//类的适配器模式
//适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题
//当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
public class ClazzTest extends Clazz implements Clazzs {
    @Override
    public void method1() {
        System.out.println("这是类方法1");
    }

    public static void main(String[] args) {
        Clazzs clazzs = new ClazzTest();
        clazzs.method();
        clazzs.method1();
    }
}

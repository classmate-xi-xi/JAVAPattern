package Adapter.InterfaceAdapter;

//接口适配器当不希望实现一个接口中所有的方法时，可以创建一个抽象类，实现所有方法，我们写别的类的时候，继承抽象类即可。
public class Test {
    public static void main(String[] args) {
        Clazz clazz1 = new Clazz1();
        Clazz clazz2 = new Clazz2();
        clazz1.method();
        clazz1.method1();
        clazz2.method();
        clazz2.method1();
    }
}

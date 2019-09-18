package Factory;
/*
1.对实现了同一接口的一些类进行实例的创建
2.多个工厂模式 提供不同的工厂方法进行分别实例化对象使用
3.静态类的方法可直接调用
4.抽象工厂模式 不需要进行代码的改动 当需要增加需求方法时只需要多开辟一个工厂实现接口进行使用即可
 */
public class FactoryTest {

    public static Factory test(){
        return new Methoder();
    }
    public Factory test1(){
        return new Methoder1();
    }

    public static void main(String[] args) {
        FactoryTest t = new FactoryTest();
        Factory factory = t.test();
        Factory factory2 = FactoryTest.test();
        Factory factory1 = t.test1();
        factory.method();
        factory1.method();
        factory2.method();
    }
}

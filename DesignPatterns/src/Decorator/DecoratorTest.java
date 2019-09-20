package Decorator;
/*
装饰器模式
是需要扩展一个类的功能,动态的为一个对象增加功能，而且还能动态撤销而类的继承不能做到这一点，继承的功能是静态的，不能动态增删
产生过多相似的对象，不易排错！
踩了坑 ！！！
 */
public class DecoratorTest {
    public static void main(String[] args) {
        DecoratorClass dc = new DecoratorClasss();
        DecoratorClass decoratorClasss = new Decorator(dc);
        decoratorClasss.method();
    }
}

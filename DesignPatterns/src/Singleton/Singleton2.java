package Singleton;

/*通过内部类维护单例 JVM通过线程之间的互斥
当我们第一次调用get方法时将instance创建仅一次开辟空间初始化
仅在第一次调用的时候使用互斥机制*/
public class Singleton2 {

    private Singleton2(){
    }

    private static class SingletonFactory {
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonFactory.instance;
    }
}

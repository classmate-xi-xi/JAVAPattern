package Singleton;

public class Singleton1 {
    //持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Singleton1 instance = null;

    //防止实例化对象
    private Singleton1(){

    }

    //创建实例
    public static Singleton1 getInstance(){
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }

    public static synchronized Singleton1 getInstance1() {
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }

    public static synchronized Singleton1 getInstance2(){
        if (instance==null){
            synchronized (instance){
                if (instance==null)
                    instance = new Singleton1();
            }
        }
        return instance;
    }


    public Object resolve(){
        return instance;
    }
}

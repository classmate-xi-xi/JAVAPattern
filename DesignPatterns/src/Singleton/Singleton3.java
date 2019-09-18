package Singleton;

/*
在创建类的时候进行同步
将创建对象和get分离 单独为创建进行synchronized
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3(){

    }

    private static synchronized void init(){
        if (instance == null){
            instance=new Singleton3();
        }
    }

    public Singleton3 getInstance(){
        if (instance==null){
            init();
        }
        return instance;
    }
}

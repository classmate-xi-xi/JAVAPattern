package Singleton;

/**
 * @author: ywx
 * @description 双重锁校验
 * @Date: 2022/08/25
 */

public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}

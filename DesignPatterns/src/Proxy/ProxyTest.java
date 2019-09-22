package Proxy;
/*
修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
就是采用一个代理类调用原有的方法，且对产生的结果进行控制
使用代理模式，可以将功能划分的更加清晰，有助于后期维护
 */
public class ProxyTest implements ProxyInterface {
    private ProxyClazz pc;

    public ProxyTest(){
        super();
        this.pc = new ProxyClazz();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
    @Override
    public void method() {
        atfer();
        pc.method();
        before();
    }
    public static void main(String[] args) {
        ProxyInterface p = new ProxyTest();
        p.method();
    }
}

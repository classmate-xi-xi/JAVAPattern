package Decorator;

public class Decorator implements DecoratorClass {
    private DecoratorClass dc;

    public Decorator(DecoratorClass dc){
        super();
        this.dc = dc;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        dc.method();
        System.out.println("after decorator!");
    }
}

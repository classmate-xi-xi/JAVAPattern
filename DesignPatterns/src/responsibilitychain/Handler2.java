package responsibilitychain;

/**
 * @author: ywx
 * @description
 * @Date: 2022/08/25
 */

public class Handler2 extends AbstractHandler {

    @Override
    void doHandler(NettyHandlerChainContext handlerChainContext, Object obj0) {
        obj0 = obj0.toString() + "...handler2的尾部......";
        System.out.println("我是Handler2的实例，我在处理：" + obj0);
        handlerChainContext.runNextHandler(obj0);
    }
}

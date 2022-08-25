package responsibilitychain;

/**
 * @author: ywx
 * @description
 * @Date: 2022/08/25
 */

public class Handler1 extends AbstractHandler {

    @Override
    void doHandler(NettyHandlerChainContext handlerChainContext, Object obj0) {
        obj0 = obj0.toString() + "..handler1的尾巴.....";
        System.out.println("我是Handler1的实例，我在处理：" + obj0);
        // 继续执行下一个
        handlerChainContext.runNextHandler(obj0);
    }
}

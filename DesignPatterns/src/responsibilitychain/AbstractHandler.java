package responsibilitychain;

/**
 * @author: ywx
 * @description handler抽象类
 * @Date: 2022/08/25
 */

abstract class AbstractHandler {
    /**
     * handler处理事件方法
     * @param handlerChainContext
     * @param arg0
     */
    abstract void doHandler(NettyHandlerChainContext handlerChainContext, Object arg0);
}

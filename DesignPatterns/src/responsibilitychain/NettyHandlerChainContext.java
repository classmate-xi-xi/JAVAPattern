package responsibilitychain;

/**
 * @author: ywx
 * @description 仿照netty handle
 * @Date: 2022/08/25
 */

public class NettyHandlerChainContext {
    /**
     * handler下一个节点
     */
    NettyHandlerChainContext next;
    AbstractHandler handler;

    public NettyHandlerChainContext(AbstractHandler handler) {
        this.handler = handler;
    }

    void handler(Object oj0) {
        this.handler.doHandler(this, oj0);
    }

    void runNextHandler(Object oj0) {
        if (this.next != null) {
            this.next.handler(oj0);
        }
    }
}

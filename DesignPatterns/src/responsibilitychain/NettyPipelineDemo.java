package responsibilitychain;

/**
 * @author: ywx
 * @description netty的责任链模式demo
 * @Date: 2022/08/25
 */

public class NettyPipelineDemo {

    /**
     * 初始化是构造一个head 作为责任链的头结点，不一定需要具体的处理
     */
    public NettyHandlerChainContext head = new NettyHandlerChainContext(new AbstractHandler() {
        @Override
        void doHandler(NettyHandlerChainContext handlerChainContext, Object arg0) {
            handlerChainContext.runNextHandler(arg0);
        }
    });

    public void processRequest(Object obj0) {
        this.head.handler(obj0);
    }

    public void addLast(AbstractHandler handler) {
        NettyHandlerChainContext context = head;
        while (context.next != null) {
            context = context.next;
        }
        context.next = new NettyHandlerChainContext(handler);
    }

    public static void main(String[] args) {
        NettyPipelineDemo demo = new NettyPipelineDemo();
        // 添加多个处理函数形成一个链
        demo.addLast(new Handler1());
        demo.addLast(new Handler2());
        demo.addLast(new Handler2());
        // 模拟一个发起请求后 链的处理方式
        demo.processRequest("我是一个请求。。。。。。");

        /**
         * 打印结果：
         * 我是Handler1的实例，我在处理：我是一个请求。。。。。。..handler1的尾巴.....
         * 我是Handler2的实例，我在处理：我是一个请求。。。。。。..handler1的尾巴........handler2的尾部......
         * 我是Handler2的实例，我在处理：我是一个请求。。。。。。..handler1的尾巴........handler2的尾部.........handler2的尾部......
         */
        demo.processRequest("我是二个请求。。。。。。");
        // 每次都将形成一个链式的结构 对每一个请求进行多个handler校验或处理
    }

}

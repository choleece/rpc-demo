package cn.choleece.rpc.demo.netty;

import cn.choleece.rpc.demo.consumer.ClientBootstrap;
import cn.choleece.rpc.demo.provider.HelloServiceImpl;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by choleece on 2019/2/22.
 */
/**
 * 用于处理请求数据
 */
public class HelloServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        // 如何符合约定，则调用本地方法，返回数据
        if (msg.toString().startsWith(ClientBootstrap.providerName)) {
            String result = new HelloServiceImpl()
                    .hello(msg.toString().substring(msg.toString().lastIndexOf("#") + 1));
            ctx.writeAndFlush(result);
        }
    }
}

package cn.choleece.rpc.demo.provider;

import cn.choleece.rpc.demo.netty.NettyServer;

/**
 * Created by choleece on 2019/2/22.
 */
public class ServerBootStrap {
    public static void main(String[] args) {
        NettyServer.startServer("localhost", 8088);
    }
}

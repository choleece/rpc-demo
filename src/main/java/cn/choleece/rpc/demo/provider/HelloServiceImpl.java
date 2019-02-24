package cn.choleece.rpc.demo.provider;

import cn.choleece.rpc.demo.publicinterface.HelloService;

/**
 * Created by choleece on 2019/2/21.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String msg) {
        return msg != null ? msg + " -----> I am fine." : "I am fine.";
    }
}

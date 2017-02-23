package joshuahw.sample.service;

import joshuahw.sample.api.HelloService;
import joshuahw.server.RpcService;

/**
 * 接口实现
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

}

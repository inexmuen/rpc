package joshuahw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RPC服务启动入口
 */
public class RpcBootstrap {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring-zk-rpc-server.xml");
    }
}
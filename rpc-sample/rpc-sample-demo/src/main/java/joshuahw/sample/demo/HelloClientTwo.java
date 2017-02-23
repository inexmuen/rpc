package joshuahw.sample.demo;

import joshuahw.client.RpcProxy;
import joshuahw.sample.api.HelloService;
import joshuahw.sample.api.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * RPC Request/Response Demo
 */
public class HelloClientTwo {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello(new Person("Joshua", "Ho"));
        System.out.println(result);

        System.exit(0);
    }
}

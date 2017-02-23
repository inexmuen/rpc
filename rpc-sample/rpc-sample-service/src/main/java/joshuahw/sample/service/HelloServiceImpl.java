package joshuahw.sample.service;

import joshuahw.sample.api.HelloService;
import joshuahw.sample.api.Person;
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

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}

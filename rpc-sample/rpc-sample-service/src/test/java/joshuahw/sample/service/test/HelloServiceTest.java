package joshuahw.sample.service.test;

import joshuahw.sample.service.HelloServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * test
 */
public class HelloServiceTest {

    @Test
    public void testHello() {
        HelloServiceImpl hsi = new HelloServiceImpl();
        String result = hsi.hello("test");
        Assert.assertNotNull(result);
    }
}

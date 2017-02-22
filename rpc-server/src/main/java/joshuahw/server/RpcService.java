package joshuahw.server;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RPC 服务注解（标注在服务实现类上）
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RpcService {

    /**
     * 服务接口类
     * <p>
     * 标注在impl类上标明实现的接口定义类，通过RpcService.value()可以获取对应接口定义类的impl类
     */
    Class<?> value();

    /**
     * 服务版本号
     */
    String version() default "";
}

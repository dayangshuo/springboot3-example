package cn.dayangshuo.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.*;

import java.util.Optional;


/**
 * @author DAYANG
 */
@Configuration(proxyBeanMethods = false)
public class MyRoutingConfiguration {

    private static final RequestPredicate ACCEPT_JSON = RequestPredicates.accept(MediaType.APPLICATION_JSON);

    @Bean
    public RouterFunction<ServerResponse> routerFunction() {
        return RouterFunctions.route()
                .GET("/hello2", ACCEPT_JSON, request -> {
                    Optional<String> optional = request.param("name");
                    String name = optional.map(Object::toString).orElse("null");
                    return ServerResponse.ok().body(String.join(",", "hello", name));
                })
                .build();
    }
}

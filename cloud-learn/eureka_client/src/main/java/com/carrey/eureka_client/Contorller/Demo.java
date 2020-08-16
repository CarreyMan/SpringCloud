package com.carrey.eureka_client.Contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zrk
 */
@RestController
public class Demo {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "carrey") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}

package com.dtdx.springcloudzookeeper.productserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description 服务提供方
 * @Author huawei
 * @Date 2019/2/24 16:26
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/vi/product")
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public Object hello(@RequestParam("name") String name) {
        log.info("param:name->{}", name);
        return "hello:" + name;

    }
}

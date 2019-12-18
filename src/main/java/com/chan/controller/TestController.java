package com.chan.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Chan
 * @Date: 2019/12/17 15:44
 * @Description:
 */
@Log4j2
@RestController
public class TestController {

    @GetMapping("/getTest")
    public String getTest(@RequestParam("value") String value) {
        log.info("getTest:{}",value);
        return value;
    }

    @PostMapping("/postTest")
    public String postTest(@RequestParam("value") String value) {
        log.info("postTest:{}",value);
        return value;
    }

}

package com.cchup.idcard.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IdcardController {
	private static final Logger logger = LoggerFactory
			.getLogger(IdcardController.class);
    @RequestMapping("/")
    String index(){
    	logger.info("index loading。。。");
        return "index";
    }
}

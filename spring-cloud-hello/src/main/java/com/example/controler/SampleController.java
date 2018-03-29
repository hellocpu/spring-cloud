package com.example.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class SampleController {
	@Autowired
	private Info info;
	
	@Value("${mysqldb.datasource.username}")
	private String username;
	
	@ResponseBody
	@RequestMapping("/hello")
	String index() {
		return "hello,"+ username;
	}
}

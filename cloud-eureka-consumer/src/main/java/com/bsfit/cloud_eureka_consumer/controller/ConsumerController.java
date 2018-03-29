package com.bsfit.cloud_eureka_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bsfit.cloud_eureka_consumer.api.RemoteInterface;

@Controller
public class ConsumerController {

	@Autowired
	RemoteInterface remoteInterface;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return remoteInterface.hi();
	}
}
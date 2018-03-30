package com.bsfit.cloud_eureka_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EurekaProviderController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/eureka/provider")
	@ResponseBody
	public String test() {
		return "current port :" + port;
	}
}

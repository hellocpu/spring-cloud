package com.bsfit.cloud_eureka_provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EurekaProviderController {
	@RequestMapping("/eureka/provider")
	@ResponseBody
	public String test(){
		return "eureka provider";
	}
}

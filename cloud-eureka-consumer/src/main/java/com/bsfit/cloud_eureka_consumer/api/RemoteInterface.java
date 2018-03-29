package com.bsfit.cloud_eureka_consumer.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="eureka-provider")
public interface RemoteInterface {
	@RequestMapping(value = "/eureka/provider")
    public String hi();
}

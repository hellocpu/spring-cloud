package com.example.controler;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class SampleController {
	@Autowired
	private Info info;

	@Autowired
	private DiscoveryClient discoveryClient;

	@Value("${mysqldb.datasource.username}")
	private String username;

	@Value("${redis.uri}")
	private String redisPort;

	@ResponseBody
	@RequestMapping("/hello")
	String index() {
		StringBuilder buf = new StringBuilder();
		List<String> serviceIds = discoveryClient.getServices();
		if (!CollectionUtils.isEmpty(serviceIds)) {
			for (String s : serviceIds) {
				System.out.println("serviceId:" + s);
				List<ServiceInstance> serviceInstances = discoveryClient.getInstances(s);
				if (!CollectionUtils.isEmpty(serviceInstances)) {
					for (ServiceInstance si : serviceInstances) {
						buf.append("[" + si.getServiceId() + " host=" + si.getHost() + " port=" + si.getPort() + " uri="
								+ si.getUri() + "]");
					}
				} else {
					buf.append("no service.");
				}
			}
		}

		return buf.toString();
	}
}

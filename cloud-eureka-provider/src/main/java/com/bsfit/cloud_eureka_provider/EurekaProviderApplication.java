package com.bsfit.cloud_eureka_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient // 激活eureka中的DiscoveryClient实现
@EnableEurekaClient
public class EurekaProviderApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(EurekaProviderApplication.class, args);
    }
}

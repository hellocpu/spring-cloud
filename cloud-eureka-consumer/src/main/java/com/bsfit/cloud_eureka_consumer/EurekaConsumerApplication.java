package com.bsfit.cloud_eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class EurekaConsumerApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaConsumerApplication.class, args);
    }
}

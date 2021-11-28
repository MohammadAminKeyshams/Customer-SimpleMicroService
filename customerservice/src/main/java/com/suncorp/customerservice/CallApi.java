package com.suncorp.customerservice;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "employee")
@LoadBalancerClient(name = "employee", configuration=LoadBalancerConfiguration.class)
public interface CallApi {
    @RequestMapping("/handShake/sayHello")
    String handShakeWithEmployee();
}

package com.suncorp.customerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HandShake")
public class HandShake {

    @Autowired
    CallApi callApi;


    @GetMapping("/sayHello")
    public String sayHello(){
        System.out.println(callApi.handShakeWithEmployee());
        return "Hello Im Customer Service";
    }

}

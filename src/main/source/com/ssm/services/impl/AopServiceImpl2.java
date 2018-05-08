package com.ssm.services.impl;


import com.ssm.services.AopService;

//@Service("AopService")
public class AopServiceImpl2 implements AopService {
    public void eat() {
        System.out.println("歪果仁吃饭");
    }

    public void sleep() {
        System.out.println("歪果仁睡觉");
    }
}

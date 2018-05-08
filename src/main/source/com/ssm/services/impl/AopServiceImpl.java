package com.ssm.services.impl;
import org.springframework.stereotype.Service;
import com.ssm.services.AopService;

@Service("aopService")
public class AopServiceImpl implements AopService {
    public void eat() {
        System.out.println("中国人吃饭！");
    }

    public void sleep() {
        System.out.println("中国人睡觉!");
    }
}

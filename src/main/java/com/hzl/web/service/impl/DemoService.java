package com.hzl.web.service.impl;

import com.hzl.web.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService{

    @Override
    public void hello(String arg) {
        System.out.println("job demo...");
    }
}

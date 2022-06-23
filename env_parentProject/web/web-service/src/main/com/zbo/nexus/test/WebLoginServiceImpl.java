package com.zbo.nexus.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebLoginServiceImpl implements WebLoginService {

    @Autowired
    OrderService orderService;

    @Override
    public void login() {
        orderService.findResource();
    }
}

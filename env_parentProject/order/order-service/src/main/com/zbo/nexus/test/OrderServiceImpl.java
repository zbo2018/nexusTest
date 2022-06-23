package com.zbo.nexus.test;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<String> findAll() {
        StringUtil.sysStr();
        return null;
    }
}

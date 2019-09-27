package com.zrh.server;

import com.zrh.dubbo.server.api.DemoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author zhangrenhua
 * @date 2019/9/26
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "say hello : " + name;
    }
}

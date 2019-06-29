package com.qiao.feign.configuration.fallback;


import com.qiao.feign.service.TestUserService;
import org.springframework.stereotype.Component;

/**
 * @author huangqf
 * @date 2019-06-29
 */
@Component
public class HystrixClientFallback implements TestUserService {

    @Override
    public String testUser(String text) {
        return "失败:" + text;
    }
}

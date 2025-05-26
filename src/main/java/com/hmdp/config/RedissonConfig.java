package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: RedissonConfig
 * Package: com.hmdp.config
 * Description:
 *
 * @Author JIAYI WU
 * @Create 2025/5/26 16:15
 * @Version 1.0
 */

@Configuration
public class RedissonConfig {
    @Bean
    public RedissonClient redissonClient(){
        // 配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.88.129:6379").setPassword("123321");
        // 创建RedissonClient对象
        return Redisson.create(config);
    }
}

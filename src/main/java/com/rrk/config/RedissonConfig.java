//package com.rrk.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
///**
// * 改成单例模式（目的：减少redis连接数，缓解连接池的压力）
// */
//@Configuration
//@Slf4j
//public class RedissonConfig {
//
//
//    /**
//     * @return
//     * @throws IOException
//     */
//    @Bean
//    public RedissonClient redisson() throws IOException {
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://" + "127.0.0.1" + ":" + "6379");
//        RedissonClient redisson = Redisson.create(config);
//        return redisson;
//    }
//}

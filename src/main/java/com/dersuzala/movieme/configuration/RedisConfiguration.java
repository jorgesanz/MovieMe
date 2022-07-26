package com.dersuzala.movieme.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {

        RedisStandaloneConfiguration redisStandaloneConfiguration = new
                RedisStandaloneConfiguration("localhost", 6379);

        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//
//        jedisConnectionFactory.setHostName("redis-api-manager-cache.redis.cache.windows.net");
//        jedisConnectionFactory.setPort(6380);
//        jedisConnectionFactory.setPassword("PKi6krAVLNLm9jAyfGoRlMX2hSy1H7rf8AzCaLteweA=");
        jedisConnectionFactory.setPassword("password");
        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);
        return template;
    }
}

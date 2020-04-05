package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou *
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.changgou.goods.feign")
@EnableElasticsearchRepositories
public class SearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

}
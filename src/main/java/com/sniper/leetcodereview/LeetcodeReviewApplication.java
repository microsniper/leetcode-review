package com.sniper.leetcodereview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = {"com.sniper.leetcodereview.mapper"})
@ComponentScan(basePackages = {"com.sniper.leetcodereview.*"})
@SpringBootApplication
public class LeetcodeReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeReviewApplication.class, args);
    }

}

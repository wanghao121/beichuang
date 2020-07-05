package com.beichuang.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Date 2020/7/4 11:28
 * @Author wanghao
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.beichuang.crm.project.dao")
public class BeichuangApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeichuangApplication.class, args);
    }
}

package com.beichuang.crm.framework.config;

import com.beichuang.crm.framework.util.help.BaseEnumConverterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Date 2020/7/14 01:42
 * @Author wanghao
 * @Version 1.0
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 注册ConverterFactory(类型转换器工厂)
        registry.addConverterFactory(new BaseEnumConverterFactory());
    }
}

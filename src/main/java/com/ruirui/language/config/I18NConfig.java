package com.ruirui.language.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * @Author: 姚飞虎
 * @Date: 2021/9/18 2:11 下午
 * @Description:
 */
@Configuration
public class I18NConfig {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
        messageBundle.setBasenames("classpath:message/messages");
        messageBundle.setDefaultEncoding("UTF-8");
        return messageBundle;
    }
}

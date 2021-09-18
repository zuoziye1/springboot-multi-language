package com.ruirui.language.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @Author: 姚飞虎
 * @Date: 2021/9/17 6:43 下午
 * @Description:
 */
public class LocalUtil {

    public static String getMessage(String code) {
        return getMessage(code, null);
    }

    public static String getMessage(String code, Object[] args) {
        return getMessage(code, args, "");
    }

    public static String getMessage(String code, Object[] args, String defaultMessage) {

        Locale locale = LocaleContextHolder.getLocale();
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("i18n/messages");
        String content;
        try{
            content = messageSource.getMessage(code, args, locale);
        }catch (Exception e){
            content = defaultMessage;
        }
        return content;

    }
}

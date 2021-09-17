package com.ruirui.language.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * @Author: 姚飞虎
 * @Date: 2021/9/17 6:43 下午
 * @Description:
 */
@Component
public class LocalUtil {

    private static MessageSource messageSource;

    public LocalUtil(MessageSource messageSource) {
        LocalUtil.messageSource = messageSource;
    }

    /**
     * 获取单个国际化翻译值
     */
    public static String get(String msgKey) {
        try {
            return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }
}

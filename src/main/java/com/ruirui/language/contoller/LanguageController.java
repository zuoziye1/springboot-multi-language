package com.ruirui.language.contoller;

import com.ruirui.language.utils.LocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Locale;

/**
 * @Author: 姚飞虎
 * @Date: 2021/9/17 7:07 下午
 * @Description:
 */
@RestController
@RequestMapping("/lang")
public class LanguageController {

    @Resource
    MessageSource messageSource ;

    @GetMapping("/language")
    public String language() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("country.name",null, LocaleContextHolder.getLocale());
    }
}

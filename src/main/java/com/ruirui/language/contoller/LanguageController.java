package com.ruirui.language.contoller;

import com.ruirui.language.utils.LocalUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 姚飞虎
 * @Date: 2021/9/17 7:07 下午
 * @Description:
 */
@RestController
@RequestMapping("/lang")
public class LanguageController {

    @GetMapping("/language")
    public String language() {

        //调用
        String message = LocalUtil.get("country.name");
        return message;
    }
}

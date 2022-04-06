package com.nuvi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OAuthController {
    @GetMapping("/oauth/callback/kakao")
    public @ResponseBody
    String kakaoCallback(String code) {
        return "카카오 인증완료" + code;
    }
}

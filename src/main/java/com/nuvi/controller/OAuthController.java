package com.nuvi.controller;

import com.nuvi.service.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/oauth/callback/kakao")
public class OAuthController {

    @Autowired
    private OAuthService oAuthService;

    @GetMapping("")
    public String kakaoLogin(String code, HttpSession session, RedirectAttributes redirect) {
        String accessToken = oAuthService.getKakaoAccessToken(code);
        redirect.addAttribute("userInfo", oAuthService.getUserInfo(accessToken));
        return "OAuth";
    }
}

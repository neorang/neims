package com.neorang.neims.users.controller;

import com.neorang.neims.users.dto.LoginForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/login")
    public void login(@RequestBody LoginForm loginForm) {
        log.info("loginForm = {}", loginForm);
    }
}

package com.neorang.neims.users.controller;

import com.neorang.neims.users.dto.LoginForm;
import com.neorang.neims.users.dto.SignupForm;
import com.neorang.neims.users.service.UserSerivce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserSerivce userSerivce;

    @PostMapping("/login")
    public void login(@RequestBody LoginForm loginForm) {
        log.info("loginForm = {}", loginForm);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> login(@RequestBody SignupForm signupForm) {
        log.info("signupForm = {}", signupForm);
        userSerivce.save(signupForm);

        return ResponseEntity.status(HttpStatus.OK).body("welecome");
    }
}

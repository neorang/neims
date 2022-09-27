package com.neorang.neims.globals.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class SecurityConfigTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void passwordEncoder() {
        // given
        String password1 = "password";
        String password2 = "password";

        // when
        String encodedPassword1 = passwordEncoder.encode(password1);
        String encodedPassword2 = passwordEncoder.encode(password2);

        log.info("encodedPassword1 = {}", encodedPassword1);
        log.info("encodedPassword2 = {}", encodedPassword2);

        // then
        assertThat(password1).isNotEqualTo(encodedPassword1);
        assertThat(passwordEncoder.matches(password1, encodedPassword1)).isTrue();
        // salt 값을 추가하여 서로 다른 문자열로 암호화한다.
        assertThat(encodedPassword1).isNotEqualTo(encodedPassword2);
    }
}
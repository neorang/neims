package com.neorang.neims.globals.config;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.MessageSourceAccessor;

import java.util.Locale;

@Slf4j
@SpringBootTest
class LocaleConfigTest {

    @Autowired
    private MessageSourceAccessor messageSourceAccessor;

    @Test
    void messageSourceAccessor() {
        log.info("messageSourceAccessor = {}", messageSourceAccessor.getMessage("hello.world"));
        log.info("messageSourceAccessor & Locale = {}", messageSourceAccessor.getMessage("hello.world", Locale.ENGLISH));

        Assertions.assertThat(messageSourceAccessor.getMessage("hello.world")).isEqualTo("안녕하세요!");
        Assertions.assertThat(messageSourceAccessor.getMessage("hello.world", Locale.ENGLISH)).isEqualTo("Hello World!");
    }
}
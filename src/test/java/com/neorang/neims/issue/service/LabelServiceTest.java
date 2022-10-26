package com.neorang.neims.issue.service;

import com.neorang.neims.issue.domain.Color;
import com.neorang.neims.issue.domain.Label;
import com.neorang.neims.issue.dto.LabelForm;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@SpringBootTest
class LabelServiceTest {

    @Autowired
    LabelService labelService;

    @Test
    @Transactional
    void create() {
        //given
        LabelForm form = LabelForm.builder()
                .label("test label")
                .color(Color.BLACK)
                .build();

        //when
        Label created = labelService.create(form);

        //then
        log.info("created label #{}", created.getLabelId());
        Assertions.assertThat(created.getLabelId()).isNotNull();
        Assertions.assertThat(created.getLabel()).isEqualTo("test label");
        Assertions.assertThat(created.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    @Transactional
    void update() {
        //given
        Label label = labelService.findById(1L);

        LabelForm form = LabelForm.builder()
                .labelId(label.getLabelId())
                .label("update label")
                .color(Color.RED)
                .build();

        //when
        Label updated = labelService.update(form);

        //then
        log.info("updated label #{}", updated.getLabelId());
        Assertions.assertThat(updated.getLabelId()).isEqualTo(label.getLabelId());
        Assertions.assertThat(updated.getColor()).isNotEqualTo(label.getColor());
        Assertions.assertThat(updated.getLabel()).isNotEqualTo(label.getLabel());

    }

    @Test
    @Transactional
    void findById() {
        //given
        Label label = labelService.findById(1L);

        //when
        Label findById = labelService.findById(label.getLabelId());

        //then
        log.info("findById label #{}", findById.getLabelId());
        Assertions.assertThat(findById.getLabelId()).isNotNull();
        Assertions.assertThat(findById.getLabel()).isEqualTo(label.getLabel());
    }

    @Test
    @Transactional
    void delete() {
        //given
        Label label = labelService.findById(1L);

        //when
        labelService.delete(label.getLabelId());
        Label delete = labelService.findById(1L);

        //then
        Assertions.assertThat(delete.getLabelId()).isNull();
    }

}
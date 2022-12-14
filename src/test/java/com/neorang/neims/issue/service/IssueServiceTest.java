package com.neorang.neims.issue.service;

import com.neorang.neims.issue.domain.Issue;
import com.neorang.neims.issue.domain.Status;
import com.neorang.neims.issue.domain.Type;
import com.neorang.neims.issue.dto.IssueForm;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@SpringBootTest
class IssueServiceTest {

    @Autowired
    IssueService issueService;

    @Test
    @Transactional
    void regist() {
        // given
        IssueForm form = IssueForm.builder()
                .type(Type.BUG)
                .status(Status.REQUEST)
                .title("request_test")
                .description("description")
                .build();

        // when
        Issue created = issueService.request(form);

        // then
        log.info("created issue #{}", created.getIssueId());
        Assertions.assertThat(created.getIssueId()).isNotNull();
        Assertions.assertThat(created.getType()).isEqualTo(Type.BUG);
        Assertions.assertThat(created.getTitle()).isEqualTo("request_test");

    }

    @Test
    void update() {
        //given
        Issue issue = issueService.findById(1L);

        IssueForm form = IssueForm.builder()
                .issueId(issue.getIssueId())
                .type(Type.BUG)
                .status(issue.getStatus())
                .title(issue.getTitle() + "1")
                .description(issue.getDescription())
                .build();

        //when
        Issue updated = issueService.update(form);

        //then
        Assertions.assertThat(updated.getIssueId()).isEqualTo(issue.getIssueId());
        Assertions.assertThat(updated.getTitle()).isNotEqualTo(issue.getTitle());
        Assertions.assertThat(updated.getType()).isNotEqualTo(issue.getType());
    }

    @Test
    void delete(){
        //given
        Issue issue = issueService.findById(1L);

        //when
        issueService.delete(issue.getIssueId());
        Issue deleted = issueService.findById(1L);

        //then
        Assertions.assertThat(deleted).isNull();
    }
}
package com.neorang.neims.issue.dto;

import com.neorang.neims.issue.domain.Issue;
import com.neorang.neims.issue.domain.Priority;
import com.neorang.neims.issue.domain.Status;
import com.neorang.neims.issue.domain.Type;
import com.neorang.neims.users.domain.Users;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
public class IssueForm {

    private Long issueId;

    private Type type;

    private Status status;

    @Size(max = 200)
    private String title;

    @Size(max = 4000)
    private String description;

    private Priority priority;

    private LocalDate deadline;

    private String assigneeId;

    private String managerId;

    private String reviewerId;

    private String testerId;

    private String reporterId;

    private Long parentIssueId;

    @Builder
    public IssueForm(Long issueId, Type type, Status status, String title, String description, Priority priority, LocalDate deadline, String assigneeId, String managerId, String reviewerId, String testerId, String reporterId, long parentIssueId) {
        this.issueId = issueId;
        this.type = type;
        this.status = status;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.assigneeId = assigneeId;
        this.managerId = managerId;
        this.reviewerId = reviewerId;
        this.testerId = testerId;
        this.reporterId = reporterId;
        this.parentIssueId = parentIssueId;
    }

    public Issue toEntity() {
        return Issue.builder()
                .issueId(issueId)
                .type(type)
                .status(status)
                .title(title)
                .description(description)
                .priority(priority)
                .deadline(deadline)
                .assignee(Users.builder().userId(assigneeId).build())
                .manager(Users.builder().userId(managerId).build())
                .reviewer(Users.builder().userId(reviewerId).build())
                .tester(Users.builder().userId(testerId).build())
                .reporter(Users.builder().userId(reporterId).build())
                .parentIssue(Issue.builder().issueId(parentIssueId).build())
                .build();
    }
}

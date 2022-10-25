package com.neorang.neims.issue.domain;


import com.neorang.neims.globals.BaseEntity;
import com.neorang.neims.users.domain.Users;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Issue extends BaseEntity {

    @Id
    @Column(name = "issue_id")
    @GeneratedValue
    private Long issueId;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Size(max = 200)
    private String title;

    @Size(max = 4000)
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private LocalDate deadline;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users assignee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users manager;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users reviewer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users tester;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users reporter;

    @ManyToOne
    @JoinColumn(name = "parentIssueId")
    private Issue parentIssue  = this;

    private LocalDateTime resolvedAt;

    @Builder
    public Issue (Long issueId, Type type, Status status, String title, String description, Priority priority, LocalDate deadline, Users assignee, Users manager, Users reviewer, Users tester, Users reporter, Issue parentIssue) {
        this.issueId = issueId;
        this.type = type;
        this.status = status;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.assignee = assignee;
        this.manager = manager;
        this.reviewer = reviewer;
        this.tester = tester;
        this.reporter = reporter;
        this.parentIssue = parentIssue;
    }

    public void updateType(Type type) {
        this.type = type;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void changePriority(Priority priority) {
        this.priority = priority;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void assignToUser(String userId) {
        this.assignee = Users.builder().userId(userId).build();
    }

    public void assignManager(String userId) {
        this.manager = Users.builder().userId(userId).build();
    }
}
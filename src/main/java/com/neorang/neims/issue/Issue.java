package com.neorang.neims.issue;


import com.neorang.neims.globals.BaseEntity;
import com.neorang.neims.users.Users;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
public class Issue extends BaseEntity {

    @Id
    @Column(name = "issue_id")
    @GeneratedValue
    private long issueId;

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
}

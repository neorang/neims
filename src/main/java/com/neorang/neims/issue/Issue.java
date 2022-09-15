package com.neorang.neims.issue;


import com.neorang.neims.globals.BaseEntity;
import com.neorang.neims.users.Users;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
public class Issue extends BaseEntity {

    @Id
    @GeneratedValue
    private long issueId;

    private Type type;

    private Status status;

    private String title;

    private String description;

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

    private LocalDate resolvedAt;
}

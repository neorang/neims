package com.neorang.neims.issue;

import com.neorang.neims.globals.BaseEntity;
import com.neorang.neims.users.Users;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class IssueActivity extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private long activityId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id", referencedColumnName = "issue_id")
    private Issue issue;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @Size(max = 4000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users assignee;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users reviewer;
}

package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.BaseEntity;
import com.neorang.neims.users.domain.Users;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class IssueWatcher extends BaseEntity implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issueId")
    private Issue issue;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private Users users;

    @Enumerated(EnumType.STRING)
    private BlindYn blindYn;

}

package com.neorang.neims.issue;

import com.neorang.neims.globals.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class IsrLabel extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private long issueLabelId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id" , referencedColumnName = "issue_id")
    private Issue issue;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "label_id" , referencedColumnName = "label_id")
    private Label label;
}

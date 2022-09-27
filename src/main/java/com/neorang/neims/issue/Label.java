package com.neorang.neims.issue;

import com.neorang.neims.globals.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Label extends BaseEntity {

    @Id
    @Column(name = "label_id")
    @GeneratedValue
    private long labelId;

    @NotNull
    @Size(max = 50)
    private String label;

    @Enumerated(EnumType.STRING)
    private Color color;

}

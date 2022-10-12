package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Builder
    public Label(long labelId, String label, Color color) {
        this.labelId = labelId;
        this.label = label;
        this.color = color;
    }

}

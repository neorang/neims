package com.neorang.neims.issue.dto;

import com.neorang.neims.issue.domain.Color;
import com.neorang.neims.issue.domain.Label;
import lombok.Builder;
import lombok.Getter;

@Getter
public class LabelForm {

    private long labelId;

    private String label;

    private Color color;

    @Builder
    public LabelForm(long labelId, String label, Color color) {
        this.labelId = labelId;
        this.label = label;
        this.color = color;
    }

    public Label toEntity() {
        return Label.builder()
                .labelId(labelId)
                .label(label)
                .color(color)
                .build();
    }

}

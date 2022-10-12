package com.neorang.neims.issue.service;

import com.neorang.neims.issue.domain.Label;
import com.neorang.neims.issue.dto.LabelForm;

public interface LabelService {

    Label create(LabelForm form);

    Label update(LabelForm form);

    Label findById(long issueId);

    void delete(long issueId);

}

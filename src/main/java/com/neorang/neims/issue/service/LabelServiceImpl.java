package com.neorang.neims.issue.service;

import com.neorang.neims.issue.domain.Label;
import com.neorang.neims.issue.dto.LabelForm;
import com.neorang.neims.issue.repository.LabelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class LabelServiceImpl implements LabelService{
    private final LabelRepository labelRepository;

    @Override
    public Label create(LabelForm form) {
        Label label = form.toEntity();
        return labelRepository.save(label);
    }

    @Override
    public Label update(LabelForm form) {
        Label label = findById(form.getLabelId());
        label.updateLabel(form.getLabel());
        label.updateColor(form.getColor());

        return label;
    }

    @Override
    public Label findById(Long issueId) {
        return labelRepository.findById(issueId)
                .orElseThrow(() -> new NoSuchElementException("Label ID is not valid"));
    }

    @Override
    public void delete(Long issueId) {
        Label label = findById(issueId);
        labelRepository.delete(label);
    }
}

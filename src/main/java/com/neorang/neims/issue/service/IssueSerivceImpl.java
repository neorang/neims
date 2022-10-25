package com.neorang.neims.issue.service;


import com.neorang.neims.issue.domain.Issue;
import com.neorang.neims.issue.dto.IssueForm;
import com.neorang.neims.issue.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@RequiredArgsConstructor
public class IssueSerivceImpl implements IssueService{

    private final IssueRepository issueRepository;

    @Override
    public Issue request(IssueForm form) {
        Assert.isNull(form.getIssueId(), () -> form.getIssueId() + " is already registered.");
        return issueRepository.save(form.toEntity());
    }

    @Override
    public Issue update(IssueForm form) {
        Assert.notNull(form.getIssueId(), () -> "Issue ID is not valid");
        Issue issueInfo = this.findById(form.getIssueId());
        issueInfo.updateType(form.getType());
        issueInfo.updateStatus(form.getStatus());
        issueInfo.updateTitle(form.getTitle());
        issueInfo.updateDescription(form.getDescription());
        issueInfo.changePriority(form.getPriority());
        issueInfo.setDeadline(form.getDeadline());
        issueInfo.assignToUser(form.getAssigneeId());
        issueInfo.assignManager(form.getManagerId());

        return issueRepository.save(issueInfo);
    }

    @Override
    public Issue findById(Long issueId) {
        return issueRepository.findById(issueId).orElse(null);
    }

    @Override
    public void delete(Long issueId) {
        issueRepository.deleteById(issueId);
    }
}

package com.neorang.neims.issue.service;

import com.neorang.neims.issue.domain.Issue;
import com.neorang.neims.issue.dto.IssueForm;

public interface IssueService {

    Issue request(IssueForm form);

    Issue update(IssueForm form);

    Issue findById(Long issueId);

    void delete(Long issueId);

}

package com.neorang.neims.issue.repository;

import com.neorang.neims.issue.domain.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Long> {
}

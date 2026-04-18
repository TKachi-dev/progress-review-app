package com.example.progressreviewapp.repository;

import com.example.progressreviewapp.entity.ProgressRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRecordRepository extends JpaRepository<ProgressRecord, Long> {
}

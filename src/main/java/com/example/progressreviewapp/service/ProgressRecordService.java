package com.example.progressreviewapp.service;

import com.example.progressreviewapp.entity.ProgressRecord;

import java.util.List;

public interface ProgressRecordService {
    // 保存
    ProgressRecord save(ProgressRecord record);

    // 一覧取得
    List<ProgressRecord> findAll();

    // 1件取得
    ProgressRecord findById(Long id);
}

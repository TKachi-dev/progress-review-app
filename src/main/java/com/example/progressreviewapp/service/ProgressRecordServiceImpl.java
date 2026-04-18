package com.example.progressreviewapp.service;

import com.example.progressreviewapp.entity.ProgressRecord;
import com.example.progressreviewapp.repository.ProgressRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressRecordServiceImpl implements ProgressRecordService {

    private final ProgressRecordRepository repository;

    // コンストラクタ
    public ProgressRecordServiceImpl(ProgressRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProgressRecord save(ProgressRecord record) {
        return repository.save(record);
    }

    @Override
    public List<ProgressRecord> findAll() {
        return repository.findAll();
    }

    @Override
    public  ProgressRecord findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}

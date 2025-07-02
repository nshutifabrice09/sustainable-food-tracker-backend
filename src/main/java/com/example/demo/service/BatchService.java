package com.example.demo.service;

import com.example.demo.model.Batch;

import java.util.List;

public interface BatchService {
    List<Batch> getAllBatches();
    Batch getBatchById(Long id);
    Batch saveBatch(Batch batch, Long productId, Long farmId);
    Batch updateBatch(Long id, Batch batch);
    void removeBatch(Long id);
}

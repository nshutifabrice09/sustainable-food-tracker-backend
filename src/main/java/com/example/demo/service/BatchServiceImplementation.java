package com.example.demo.service;

import com.example.demo.model.Batch;
import com.example.demo.repository.BatchRepository;
import com.example.demo.repository.FarmRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchServiceImplementation implements BatchService{

    private final BatchRepository batchRepository;
    private final ProductRepository productRepository;
    private final FarmRepository farmRepository;

    public BatchServiceImplementation(BatchRepository batchRepository, ProductRepository productRepository, FarmRepository farmRepository) {
        this.batchRepository = batchRepository;
        this.productRepository = productRepository;
        this.farmRepository = farmRepository;
    }

    @Override
    public List<Batch> getAllBatches() {
        return null;
    }

    @Override
    public Batch getBatchById(Long id) {
        return null;
    }

    @Override
    public Batch saveBatch(Batch batch, Long productId, Long farmId) {
        return null;
    }

    @Override
    public Batch updateBatch(Long id, Batch batch) {
        return null;
    }

    @Override
    public void removeBatch(Long id) {

    }
}

package com.example.demo.service;

import com.example.demo.model.Batch;
import com.example.demo.model.Farm;
import com.example.demo.model.Product;
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
        return batchRepository.findAll();
    }

    @Override
    public Batch getBatchById(Long id) {
        return batchRepository.findBatchById(id);
    }

    @Override
    public Batch saveBatch(Batch batch, Long productId, Long farmId) {
        Product product = productRepository.findProductById(productId);
        Farm farm = farmRepository.findFarmById(farmId);
        batch.setProduct(product);
        batch.setFarm(farm);
        return batchRepository.save(batch);
    }

    @Override
    public Batch updateBatch(Long id, Batch batch) {
        Batch existBatch = batchRepository.findBatchById(id);
        if(existBatch != null){
            existBatch.setHarvestDate(batch.getHarvestDate());
            existBatch.setOriginCoordinates(batch.getOriginCoordinates());
            existBatch.setQrCodeUrl(batch.getQrCodeUrl());
            return batchRepository.save(existBatch);
        }
        return null;
    }

    @Override
    public void removeBatch(Long id) {
        batchRepository.deleteById(id);
    }
}

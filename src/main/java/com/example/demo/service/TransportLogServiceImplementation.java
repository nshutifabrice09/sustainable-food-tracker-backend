package com.example.demo.service;

import com.example.demo.model.Batch;
import com.example.demo.model.TransportLog;
import com.example.demo.repository.BatchRepository;
import com.example.demo.repository.TransportLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportLogServiceImplementation implements TransportLogService{

    private final TransportLogRepository transportLogRepository;
    private final BatchRepository batchRepository;

    @Autowired
    public TransportLogServiceImplementation(TransportLogRepository transportLogRepository, BatchRepository batchRepository) {
        this.transportLogRepository = transportLogRepository;
        this.batchRepository = batchRepository;
    }

    @Override
    public List<TransportLog> getAllTransportLogs() {
        return transportLogRepository.findAll();
    }

    @Override
    public TransportLog getTransportLogById(Long id) {
        return transportLogRepository.findTransportLogById(id);
    }

    @Override
    public TransportLog saveTransportLog(TransportLog transportLog, Long batchId) {
        Batch batch = batchRepository.findBatchById(batchId);
        transportLog.setBatch(batch);
        return transportLogRepository.save(transportLog);
    }

    @Override
    public TransportLog updateTransportLog(Long id, TransportLog transportLog) {
        TransportLog existTransportLog = transportLogRepository.findTransportLogById(id);
        if(existTransportLog != null){
            existTransportLog.setShippedAt(transportLog.getShippedAt());
            existTransportLog.setReceivedAt(transportLog.getReceivedAt());
            existTransportLog.setOrigin(transportLog.getOrigin());
            existTransportLog.setDestination(transportLog.getDestination());
            existTransportLog.setTransporter(transportLog.getTransporter());
            return transportLogRepository.save(existTransportLog);
        }
        return null;
    }
    @Override
    public void removeTransportLog(Long id) {
        transportLogRepository.deleteById(id);
    }
}

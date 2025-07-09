package com.example.demo.service;

import com.example.demo.model.TransportLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportLogServiceImplementation implements TransportLogService{
    @Override
    public List<TransportLog> getAllTransportLogs() {
        return null;
    }

    @Override
    public TransportLog getTransportLogById(Long id) {
        return null;
    }

    @Override
    public TransportLog saveTransportLog(TransportLog transportLog, Long batchId) {
        return null;
    }

    @Override
    public TransportLog updateTransportLog(Long id, TransportLog transportLog) {
        return null;
    }

    @Override
    public void removeTransportLog(Long id) {

    }
}

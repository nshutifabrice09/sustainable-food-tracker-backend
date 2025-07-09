package com.example.demo.service;

import com.example.demo.model.TransportLog;

import java.util.List;

public interface TransportLogService {
    List<TransportLog> getAllTransportLogs();
    TransportLog getTransportLogById(Long id);
    TransportLog saveTransportLog(TransportLog transportLog, Long batchId);
    TransportLog updateTransportLog(Long id, TransportLog transportLog);
    void removeTransportLog(Long id);
}

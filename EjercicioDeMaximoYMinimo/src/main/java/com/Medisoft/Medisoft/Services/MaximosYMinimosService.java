package com.Medisoft.Medisoft.Services;

import com.Medisoft.Medisoft.Domain.TransactionRequest;

import java.util.List;

public interface MaximosYMinimosService {
    List<Integer> maximosYMinimos(TransactionRequest transactionRequest);
}

package com.Medisoft.Medisoft.Services;

import com.Medisoft.Medisoft.Domain.ResultadoUnElemento;
import com.Medisoft.Medisoft.Domain.TransactionRequest;

import java.util.List;

public interface PotenciaService {
    List<ResultadoUnElemento> maximosYMinimos(TransactionRequest transactionRequest);
}

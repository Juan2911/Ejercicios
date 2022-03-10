package com.Medisoft.Medisoft.Services.impl;

import com.Medisoft.Medisoft.Domain.ResultadoUnElemento;
import com.Medisoft.Medisoft.Domain.TransactionRequest;
import com.Medisoft.Medisoft.Services.PotenciaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PotenciaImpl implements PotenciaService {

    @Override
    public List<ResultadoUnElemento> maximosYMinimos(TransactionRequest transactionRequest) {
        Float resultado;
        List<Float> valor = transactionRequest.getNumeros();
        List<ResultadoUnElemento> datos = new ArrayList<>();
        for (int i = 0; i < valor.size(); i++) {
            ResultadoUnElemento resultadoUnElemento = new ResultadoUnElemento();
            resultado = valor.get(i) * valor.get(i);
            resultadoUnElemento.setNumero(valor.get(i));
            resultadoUnElemento.setPotencia(resultado);
            datos.add(resultadoUnElemento);
        }
        return datos;
    }
}

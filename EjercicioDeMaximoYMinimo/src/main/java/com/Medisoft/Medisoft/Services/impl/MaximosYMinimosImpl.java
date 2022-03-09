package com.Medisoft.Medisoft.Services.impl;

import com.Medisoft.Medisoft.Domain.TransactionRequest;
import com.Medisoft.Medisoft.Services.MaximosYMinimosService;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class MaximosYMinimosImpl implements MaximosYMinimosService {

    @Override
    public List<Integer> maximosYMinimos(TransactionRequest transactionRequest) {
        List<Integer> integers = transactionRequest.getEnteros();
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < integers.size() - 1; i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                Integer a = integers.get(i);
                Integer b = integers.get(j);
                if (b > a) {
                    integers.set(i, b);
                    integers.set(j, a);
                }
            }
        }

        resultado.add(integers.get(0));
        resultado.add(integers.get(integers.size() - 1));

        return resultado;
    }
}

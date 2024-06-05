package com.unir.calculatorapi.service;

import com.unir.calculatorapi.data.SumaRepository;
import com.unir.calculatorapi.model.pojo.Suma;
import com.unir.calculatorapi.model.request.SumaRestaRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private SumaRepository sumaRepository;

    @Override
    public Suma suma(SumaRestaRequest request){

        Double total = 0.0;

        for(int i=0; i < request.getNumeros().size(); i++){
            total += request.getNumeros().get(i);
        }

        Suma suma = Suma.builder().numeros(request.getNumeros()).result(total).build();
        return sumaRepository.save(suma);
    }
}

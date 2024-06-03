package com.unir.calculatorapi.service;

import com.unir.calculatorapi.model.pojo.Result;
import com.unir.calculatorapi.model.pojo.Suma;
import com.unir.calculatorapi.model.request.SumaRestaRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Suma suma(SumaRestaRequest request){

        Double total = 0.0;

        for(int i=0; i < request.getNumeros().size(); i++){
            total += request.getNumeros().get(i);
        }


        Result result = Result.builder().result(total).build();
        Suma suma = Suma.builder().numeros(request.getNumeros()).result(result).build();


        return suma;
    }
}

package com.unir.calculatorapi.service;

import com.unir.calculatorapi.model.pojo.Result;
import com.unir.calculatorapi.model.pojo.Suma;
import com.unir.calculatorapi.model.request.SumaRestaRequest;

import java.util.List;

public interface CalculatorService {

    Suma suma(SumaRestaRequest request);

}

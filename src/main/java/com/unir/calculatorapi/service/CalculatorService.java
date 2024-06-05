package com.unir.calculatorapi.service;

import com.unir.calculatorapi.model.pojo.Suma;
import com.unir.calculatorapi.model.request.SumaRestaRequest;

public interface CalculatorService {

    Suma suma(SumaRestaRequest request);

}

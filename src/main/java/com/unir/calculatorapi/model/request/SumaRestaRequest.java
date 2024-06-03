package com.unir.calculatorapi.model.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SumaRestaRequest {
    private List<Double> numeros;

}

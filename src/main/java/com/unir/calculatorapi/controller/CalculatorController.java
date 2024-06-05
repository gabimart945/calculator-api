package com.unir.calculatorapi.controller;


import com.unir.calculatorapi.model.pojo.Suma;
import com.unir.calculatorapi.model.request.SumaRestaRequest;
import com.unir.calculatorapi.service.CalculatorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "Calculator Controller", description = "Microservicio encargado de resolver operaciones matematicas y alojar los resultados en una base de datos en memoria.")
public class CalculatorController {

    private final CalculatorServiceImpl service;

    @PostMapping("/sumas")
    @Operation(
            operationId = "sumas",
            description = "Sumar n numeros",
            summary = "Se suman n numeros y se guarda el resultado",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Numeros a sumar.",
                    required = true,
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = SumaRestaRequest.class))))
    @ApiResponse(
            responseCode = "201",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Suma.class)))
    public ResponseEntity<Suma> addProduct(@RequestBody SumaRestaRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.suma(request));
    }
}

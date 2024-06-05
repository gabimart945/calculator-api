package com.unir.calculatorapi.model.pojo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "sumas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Suma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name="numeros_sumas", joinColumns=@JoinColumn(name="suma_id"))
    @Column(name = "numeros")
    private List<Double> numeros;

    @Column(name = "result")
    private Double result;
}

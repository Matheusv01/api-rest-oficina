package com.senai.oficina.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mecanicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMecanico;
    private String nomeMecanico;
    private String numeroMecanico;
    private String cpfMecanico;
    private String enderecoMecanico;
}

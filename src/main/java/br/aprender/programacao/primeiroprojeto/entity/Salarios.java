package br.aprender.programacao.primeiroprojeto.entity;

import java.math.BigDecimal;
///@Entity
/// @Table(schema = "")
public class Salarios {
    private BigDecimal meuSalario = BigDecimal.ZERO;
    
    public Salarios( BigDecimal salario){
        this.meuSalario = salario;
    }
}

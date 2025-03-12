package br.aprender.programacao.primeiroprojeto.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;

import br.aprender.programacao.primeiroprojeto.entity.Salarios;

@Controller 
public class GeradorDeSalarios {
    
    public BigDecimal salarioProgramador(){
        Salarios salarioProgramador = new Salarios();
        salarioProgramador.setMeuSalarioDeProgramador(new BigDecimal("10.00"));

        return salarioProgramador.getMeuSalarioDeProgramador();
    }
    public Salarios todosSalarios(){
        Salarios salarios = new Salarios(new BigDecimal("10.00"), new BigDecimal("20.00"));
        return salarios;
    }

}

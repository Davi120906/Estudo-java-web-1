package br.aprender.programacao.primeiroprojeto.service;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Salarios {
    private BigDecimal meuSalario = new BigDecimal("10.00");
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, 
                    path = "/salario-programador", 
                    produces = MediaType.APPLICATION_JSON_VALUE) // Corrigido para MediaType.APPLICATION_JSON_VALUE
    public ResponseEntity<?> imprimirSalario(){
        System.out.println(meuSalario);
        System.out.println("aaa");
        return new ResponseEntity<>(meuSalario, HttpStatus.OK);
    }

}

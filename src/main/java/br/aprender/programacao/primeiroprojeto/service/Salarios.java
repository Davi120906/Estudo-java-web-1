package br.aprender.programacao.primeiroprojeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.aprender.programacao.primeiroprojeto.controller.GeradorDeSalarios;



@RestController
public class Salarios {
    @Autowired
    private GeradorDeSalarios geraSalario;
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, 
                    path = "/salario-programador", 
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> imprimirSalarioProgramador(){ 
        return new ResponseEntity<>(geraSalario.salarioProgramador(), HttpStatus.OK);
    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, 
                    path = "/todos-salarios", 
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> imprimirTodosSalario(){ 
        return new ResponseEntity<>(geraSalario.todosSalarios(), HttpStatus.OK);
    }

}

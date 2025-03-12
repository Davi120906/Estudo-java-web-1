package br.aprender.programacao.primeiroprojeto.entity;

import java.math.BigDecimal;

public class Salarios {
    private BigDecimal meuSalarioDeProgramador = BigDecimal.ZERO;
    private BigDecimal meuSalarioDeStreamer = BigDecimal.ZERO;

    public Salarios(){
    }

    public Salarios(BigDecimal SalarioProgramador) {
        this.meuSalarioDeProgramador = SalarioProgramador;
    }

    public Salarios(BigDecimal SalarioProgramador, BigDecimal SalarioStreamer) {
        this.meuSalarioDeProgramador = SalarioProgramador;
        this.meuSalarioDeStreamer = SalarioStreamer;
    }

    public BigDecimal getMeuSalarioDeProgramador() {
        return meuSalarioDeProgramador;
    }

    public void setMeuSalarioDeProgramador(BigDecimal meuSalarioDeProgramador) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
    }

    public BigDecimal getMeuSalarioDeStreamer() {
        return meuSalarioDeStreamer;
    }

    public void setMeuSalarioDeStreamer(BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }
    @Override
    public String toString(){
        return String.format("Salario de programador: %.2f, Salario de Streamer> %.2f", this.meuSalarioDeProgramador, this.meuSalarioDeStreamer);
    }
}

package com.rh.factorymethod;

public class PJ extends Funcionario {

    public PJ(String nome) {
        super(nome);
    }

    public String getTipo() {
        return "PJ";
    }
}
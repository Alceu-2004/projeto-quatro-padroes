package com.rh.factorymethod;

public class CLT extends Funcionario {

    public CLT(String nome) {
        super(nome);
    }

    public String getTipo() {
        return "CLT";
    }
}
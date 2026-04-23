package com.rh.factorymethod;

public class Estagiario extends Funcionario {

    public Estagiario(String nome) {
        super(nome);
    }

    public String getTipo() {
        return "Estagiário";
    }
}
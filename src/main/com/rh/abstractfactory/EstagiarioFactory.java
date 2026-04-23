package com.rh.abstractfactory;

import com.rh.factorymethod.*;

public class EstagiarioFactory implements FuncionarioFactory {
    public Funcionario criarFuncionario(String nome) {
        return new Estagiario(nome);
    }
}
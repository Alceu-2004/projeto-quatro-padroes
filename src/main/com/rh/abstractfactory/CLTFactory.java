package com.rh.abstractfactory;

import com.rh.factorymethod.*;

public class CLTFactory implements FuncionarioFactory {
    public Funcionario criarFuncionario(String nome) {
        return new CLT(nome);
    }
}
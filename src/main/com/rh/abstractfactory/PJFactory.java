package com.rh.abstractfactory;

import com.rh.factorymethod.*;

public class PJFactory implements FuncionarioFactory {
    public Funcionario criarFuncionario(String nome) {
        return new PJ(nome);
    }
}
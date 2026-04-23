package com.rh.abstractfactory;

import com.rh.factorymethod.Funcionario;

public interface FuncionarioFactory {
    Funcionario criarFuncionario(String nome);
}
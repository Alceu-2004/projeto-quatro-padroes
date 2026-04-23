package com.rh.bridge;

import com.rh.factorymethod.Funcionario;

public class FuncionarioBridge {

    private Funcionario funcionario;
    private Beneficio beneficio;

    public FuncionarioBridge(Funcionario funcionario, Beneficio beneficio) {
        this.funcionario = funcionario;
        this.beneficio = beneficio;
    }

    public void exibirDetalhes() {
        System.out.println(
                funcionario.getNome() +
                        " (" + funcionario.getTipo() + ")" +
                        " possui benefício: " +
                        beneficio.getDescricao()
        );
    }
}
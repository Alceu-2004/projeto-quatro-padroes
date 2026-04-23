package com.rh;

import com.rh.abstractfactory.*;
import com.rh.bridge.*;
import com.rh.factorymethod.Funcionario;
import com.rh.singleton.RHManager;

public class Main {
    public static void main(String[] args) {

        FuncionarioFactory cltFactory = new CLTFactory();
        FuncionarioFactory pjFactory = new PJFactory();

        Funcionario f1 = cltFactory.criarFuncionario("João");
        Funcionario f2 = pjFactory.criarFuncionario("Maria");

        Beneficio vt = new ValeTransporte();
        Beneficio ps = new PlanoSaude();

        FuncionarioBridge fb1 = new FuncionarioBridge(f1, vt);
        FuncionarioBridge fb2 = new FuncionarioBridge(f2, ps);

        RHManager manager = RHManager.getInstance();
        manager.adicionarFuncionario(f1);
        manager.adicionarFuncionario(f2);

        fb1.exibirDetalhes();
        fb2.exibirDetalhes();
    }
}
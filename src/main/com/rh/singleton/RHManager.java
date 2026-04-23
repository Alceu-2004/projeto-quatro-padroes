package com.rh.singleton;

import com.rh.factorymethod.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class RHManager {

    private static RHManager instance;
    private List<Funcionario> funcionarios;

    private RHManager() {
        funcionarios = new ArrayList<>();
    }

    public static RHManager getInstance() {
        if (instance == null) {
            instance = new RHManager();
        }
        return instance;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        funcionarios.forEach(f -> System.out.println(f.getNome()));
    }
}
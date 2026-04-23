package com.rh.bridge;

import com.rh.factorymethod.CLT;
import com.rh.factorymethod.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioBridgeTest {

    @Test
    void deveAssociarBeneficioAoFuncionario() {
        Funcionario f = new CLT("João");
        Beneficio beneficio = new ValeTransporte();

        FuncionarioBridge bridge = new FuncionarioBridge(f, beneficio);

        assertNotNull(bridge);
    }
}
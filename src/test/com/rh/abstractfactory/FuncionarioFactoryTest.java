package com.rh.abstractfactory;

import com.rh.factorymethod.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioFactoryTest {

    @Test
    void deveCriarFuncionarioCLTViaFactory() {
        FuncionarioFactory factory = new CLTFactory();
        Funcionario f = factory.criarFuncionario("João");

        assertEquals("CLT", f.getTipo());
    }

    @Test
    void deveCriarFuncionarioPJViaFactory() {
        FuncionarioFactory factory = new PJFactory();
        Funcionario f = factory.criarFuncionario("Maria");

        assertEquals("PJ", f.getTipo());
    }

    @Test
    void deveCriarEstagiarioViaFactory() {
        FuncionarioFactory factory = new EstagiarioFactory();
        Funcionario f = factory.criarFuncionario("Lucas");

        assertEquals("Estagiário", f.getTipo());
    }
}
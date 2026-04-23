package com.rh.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveCriarFuncionarioCLT() {
        Funcionario f = new CLT("João");

        assertEquals("João", f.getNome());
        assertEquals("CLT", f.getTipo());
    }

    @Test
    void deveCriarFuncionarioPJ() {
        Funcionario f = new PJ("Maria");

        assertEquals("PJ", f.getTipo());
    }

    @Test
    void deveCriarFuncionarioEstagiario() {
        Funcionario f = new Estagiario("Lucas");

        assertEquals("Estagiário", f.getTipo());
    }
}
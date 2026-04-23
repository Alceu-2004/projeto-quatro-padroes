package com.rh.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RHManagerTest {

    @Test
    void deveRetornarMesmaInstancia() {
        RHManager r1 = RHManager.getInstance();
        RHManager r2 = RHManager.getInstance();

        assertSame(r1, r2);
    }
}
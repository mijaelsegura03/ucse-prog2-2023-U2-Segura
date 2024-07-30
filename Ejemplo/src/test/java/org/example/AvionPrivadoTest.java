package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {
    AvionPrivado method;
    @Test
    public void testVolarCombustibleIgualA40000() {
        method = new AvionPrivado(30000,5);
        Assertions.assertEquals(method.volar(5000),40000);
    }
}

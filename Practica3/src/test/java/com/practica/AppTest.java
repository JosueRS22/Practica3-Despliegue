package com.practica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testSuma() {
        Operacion op = new Operacion(5.0, 3.0);
        assertEquals(8.0, op.suma(), "La suma debería ser 8.0");
    }

    @Test
    void testResta() {
        Operacion op = new Operacion(10.0, 4.0);
        assertEquals(6.0, op.resta(), "La resta debería ser 6.0");
    }
 
    @Test
    void testMultiplicacion() {
        Operacion op = new Operacion(2.5, 4.0);
        assertEquals(10.0, op.multiplicacion(), "La multiplicación debería ser 10.0");
    }

    @Test
    void testDivision() {
        Operacion op = new Operacion(10.0, 2.0);
        assertEquals(5.0, op.division(), "La división debería ser 5.0");
    }

    @Test
    void testDivisionPorCero() {
        Operacion op = new Operacion(10.0, 0.0);
        assertThrows(ArithmeticException.class, () -> {
            op.division();
        }, "Debería lanzar ArithmeticException al dividir por cero");
    }
}
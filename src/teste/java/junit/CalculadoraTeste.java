package teste.java.junit;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class CalculadoraTeste {
    CalculadoraTeste calc = new CalculadoraTeste();
    /**
     * Rigorous Test.
     */
    @Test
    public double rmEstimado(double carga, double repet){
        assertEquals(10, calc.rmEstimado(10, 1));
    }
}

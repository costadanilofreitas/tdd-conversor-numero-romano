package com.numero.romano;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.InvalidAttributeValueException;

public class ConverteNumeroTests {

    @Test
    public void testarconversorDeNumero(){
        ConverteNumero converteNumero = new ConverteNumero();

        Assertions.assertEquals(converteNumero.conversorDeNumero(121), "CXXI");
    }
}

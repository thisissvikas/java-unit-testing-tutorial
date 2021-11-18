package com.unit.converter;

import com.unit.converter.currency.CurrencyConverter;
import com.unit.converter.distance.DistanceConverter;
import com.unit.converter.weight.WeightConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConverterFactoryTest {

    private ConverterFactory converterFactory;

    @Before
    public void init(){
        converterFactory = new ConverterFactory();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetConverterForInvalidInput(){
        converterFactory.getConverter(4);
    }

    @Test
    public void testGetConverterForValidInput(){
        Assert.assertNotNull(converterFactory.getConverter(1));
    }

    @Test
    public void testGetConverterForValidInput2(){
        Converter converter = converterFactory.getConverter(2);
        Assert.assertTrue(converter instanceof DistanceConverter);
    }

    @Test
    public void testGetConverterForValidInput3(){
        Converter converter = converterFactory.getConverter(3);
        Assert.assertTrue(converter instanceof WeightConverter);
    }

    @Test
    public void testGetConverterNegativeScenarioForValidInput3(){
        Converter converter = converterFactory.getConverter(3);
        Assert.assertFalse(converter instanceof CurrencyConverter);
    }
}

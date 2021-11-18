package com.unit.converter.currency;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void testConvertForValidValue(){
        CurrencyConverter converter = new CurrencyConverter();
        Assert.assertEquals(742.7f, converter.convert(10), 0.0);
    }

    @Test
    public void testNegativeConvertForValidValue(){
        CurrencyConverter converter = new CurrencyConverter();
        Assert.assertNotEquals(742.8f, converter.convert(10), 0.0);
    }
}

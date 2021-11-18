package com.unit.converter;

import com.unit.converter.currency.CurrencyConverter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class UnitConverterTest {

  @Test
  public void testGetConvertedValue() {
    ConverterFactory mockConverterFactory = Mockito.mock(ConverterFactory.class);
    Mockito.when(mockConverterFactory.getConverter(Mockito.anyInt())).thenReturn(new CurrencyConverter());
    UnitConverter unitConverter = new UnitConverter(mockConverterFactory);
    Assert.assertEquals(742.7f, unitConverter.getConvertedValue(1000, 10), 0.0);
  }
}

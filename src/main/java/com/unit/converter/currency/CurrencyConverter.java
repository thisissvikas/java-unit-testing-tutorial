package com.unit.converter.currency;

import com.unit.converter.Converter;

public class CurrencyConverter implements Converter {
    @Override
    public float convert(float inputValue) {
        return (float) (inputValue * 74.27);
    }
}

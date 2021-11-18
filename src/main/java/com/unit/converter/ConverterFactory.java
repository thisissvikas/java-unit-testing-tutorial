package com.unit.converter;

import com.unit.converter.currency.CurrencyConverter;
import com.unit.converter.distance.DistanceConverter;
import com.unit.converter.weight.WeightConverter;

public class ConverterFactory {
    public Converter getConverter(int conversionChoice){
        switch (conversionChoice){
            case 1:
                return new CurrencyConverter();
            case 2:
                return new DistanceConverter();
            case 3:
                return new WeightConverter();
            default:
                throw new IllegalArgumentException();
        }
    }
}

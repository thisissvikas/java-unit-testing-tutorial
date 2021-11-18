package com.unit.converter.weight;

import com.unit.converter.Converter;

public class WeightConverter implements Converter {
  @Override
  public float convert(float inputValue) {
    return (float) (inputValue * 0.45);
  }
}

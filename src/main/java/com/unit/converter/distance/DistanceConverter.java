package com.unit.converter.distance;

import com.unit.converter.Converter;

public class DistanceConverter implements Converter {
  @Override
  public float convert(float inputValue) {
    return (float) (inputValue * 1.6);
  }
}

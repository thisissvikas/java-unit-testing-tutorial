package com.unit.converter;

import java.util.Scanner;

public class UnitConverter {
  private final ConverterFactory converterFactory;

  public UnitConverter(ConverterFactory converterFactory) {
    this.converterFactory = converterFactory;
  }

  public float getConvertedValue(int conversionChoice, float valueToBeConverted) {
    return getConverterInstance(conversionChoice).convert(valueToBeConverted);
  }

  private Converter getConverterInstance(int conversionChoice) {
    return converterFactory.getConverter(conversionChoice);
  }

  public static void main(String[] args) {
    System.out.println(
        "Conversion Tool\n Enter 1 for Currency conversion(Dollar -> Rupee)\n Enter 2 for Distance conversion(Miles -> KMs)\n Enter 3 for Weight conversion(lbs -> kgs)");
    Scanner sc = new Scanner(System.in);
    int conversionChoice = sc.nextInt();
    System.out.println("Enter the value to be converted");
    float inputValue = sc.nextFloat();
    float result = new UnitConverter(new ConverterFactory()).getConvertedValue(conversionChoice, inputValue);
    System.out.println("The converted value is : " + result);
  }
}

package com.powerone.labs;
import com.powerone.tools.ChemicalAnalyzer;

public class Laboratory {
  public void analyze(String material) {
    ChemicalAnalyzer chemicalAnalyzer = new  ChemicalAnalyzer();
    String composition = chemicalAnalyzer.analyze(material);
    System.out.println("material : " + material + " , its composition : " + composition);
  }
}

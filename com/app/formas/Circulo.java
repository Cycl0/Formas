package com.app.formas;

import com.app.formas.Forma;

import java.lang.Math;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Circulo extends Forma {
  
  private double raio;
  
  // public Circulo(String cor, double raio) {
  //     super(cor, 0, 0);
  //     this.raio = raio;
  // }

  public double getRaio() { return raio; }
  public void setRaio(double raio) { this.raio = raio; }
  
  @Override
  public void CalcularArea() {
    NumberFormat doubleFormatter = new DecimalFormat("#0.00");
    System.out.println(
      doubleFormatter.format(
          Math.pow(getRaio()/2,2) * Math.PI
      )
    );
  }
}
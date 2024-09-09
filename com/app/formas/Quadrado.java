package com.app.formas;

import com.app.formas.Forma;

public class Quadrado extends Forma {
private double lado;
  
  // public Quadrado(String cor, double lado) {
  //     super(cor, 0, 0);
  //     this.lado = lado;
  // } 

  public void setLado(double lado) { this.lado = lado; }
  public double getLado() { return lado; }
  
  @Override
  public void CalcularArea() {
    System.out.println(Double.toString(getLado()*getLado()));
  }
}
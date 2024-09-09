package com.app.formas;

import com.app.formas.Forma;

public class Triangulo extends Forma {
  // public Triangulo(String cor, double altura, double largura) {
  //     super(cor, altura, largura);
  // }
  
  @Override
  public void CalcularArea() {
    System.out.println(Double.toString(getAltura()*getLargura()/2));
  }
}
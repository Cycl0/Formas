package com.app.formas;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forma {

  private String cor;
  private double altura;
  private double largura;

  // public Forma(String cor, double altura, double largura) {
  //   this.cor = cor;
  //   this.altura = altura;
  //   this.largura = largura;
  // }
  
  @JsonProperty("cor")
  public String getCor() { return cor; }
  @JsonProperty("cor")
  public void setCor(String cor) { this.cor = cor; }
  @JsonProperty("altura")
  public double getAltura() { return altura; }
  @JsonProperty("altura")
  public void setAltura(double altura) { this.altura = altura; }
  @JsonProperty("largura")
  public double getLargura() { return largura; }
  @JsonProperty("largura")
  public void setLargura(double largura) { this.largura = largura; }

  public void MostrarCor() {
    System.out.println(getCor());
  }
  public void CalcularArea() {
    System.out.println("Forma");
  }
}

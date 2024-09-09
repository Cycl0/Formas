package com.app.fetch;

import com.app.formas.Circulo;
import com.app.formas.Quadrado;
import com.app.formas.Triangulo;
import com.app.formas.Forma;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
  
import com.fasterxml.jackson.annotation.JsonProperty;

public class FormaLista {
  private List<Circulo> circuloLista;
  private List<Quadrado> quadradoLista;
  private List<Triangulo> trianguloLista;

  @JsonProperty("circuloLista")
  public List<Circulo> getCirculoLista() { return circuloLista; }
  @JsonProperty("circuloLista")
  public void setCirculoLista(List<Circulo> circuloLista) { this.circuloLista = circuloLista; }
  @JsonProperty("quadradoLista")
  public List<Quadrado> getQuadradoLista() { return quadradoLista; }
  @JsonProperty("quadradoLista")
  public void setQuadradoLista(List<Quadrado> quadradoLista) { this.quadradoLista = quadradoLista; }
  @JsonProperty("trianguloLista")
  public List<Triangulo> getTrianguloLista() { return trianguloLista; }
  @JsonProperty("trianguloLista")
  public void setTrianguloLista(List<Triangulo> trianguloLista) { this.trianguloLista = trianguloLista; }

  public Lista<Forma> getFormas() {       Arrays.stream(lists).flatMap(Collection::stream).collect(Collectors.toList()); }

}

// public class Tipo {
//   private List<Forma> formaList;
//   @JsonProperty(index=)
//   public List<Forma> getForma() { return formaList; }
//   public void setForma(List<Forma> formaList) { this.formaList = formaList; }
// }

class CirculoLista {
  private List<Circulo> circuloLista;

  public List<Circulo> getCirculoLista() { return circuloLista; }
  public void setCirculoLista(List<Circulo> circuloLista) { this.circuloLista = circuloLista; }
}

class QuadradoLista {
  private List<Quadrado> quadradoLista;

  public List<Quadrado> getQuadradoListaa() { return quadradoLista; }
  public void setQuadradoLista(List<Quadrado> quadradoLista) { this.quadradoLista = quadradoLista; }
}

class TrianguloLista {
  private List<Triangulo> trianguloLista;

  public List<Triangulo> getTrianguloLista() { return trianguloLista; }
  public void setTrianguloLista(List<Triangulo> trianguloLista) { this.trianguloLista = trianguloLista; }
}
import com.app.formas.Forma;
import com.app.formas.Quadrado;
import com.app.formas.Circulo;
import com.app.formas.Triangulo;
import com.app.fetch.Fetch;
import com.app.fetch.FormaLista;

import java.io.IOException;

import java.util.List;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

class Main {
  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
    // List<FormaLista> formaLista = Arrays.asList(mapper.readValue(Fetch.yaml(), FormaLista.class));
    FormaLista formaLista = mapper.readValue(Fetch.yaml(), FormaLista.class);
    // formaLista.
    // for(FormaLista f: formaLista) {
    //   System.out.println(f);
    // }
    // Quadrado q = new Quadrado("Escarlate", 20);
    // q.MostrarCor();
    // q.CalcularArea();
    // Circulo c = new Circulo("Fusca", 10);
    // c.MostrarCor();
    // c.CalcularArea();
    // Triangulo t = new Triangulo("Carmesim", 10, 20);
    // t.MostrarCor();
    // t.CalcularArea();
  }
  
  
}

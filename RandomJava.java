import java.util.ArrayList;
import java.util.List;

/**
 * RandomJava
 */
public class RandomJava {
  public List<Double> listaNumeros = new ArrayList<>();

  RandomJava(int n) {
    for (int i = 0; i < n; i++) {
      listaNumeros.add(Math.random());
    }

  }

  @Override
  public String toString() {
    String numeros = "";
    for (Double numero : listaNumeros) {
      numeros += numero + "\n";
    }
    return numeros;
  }
}

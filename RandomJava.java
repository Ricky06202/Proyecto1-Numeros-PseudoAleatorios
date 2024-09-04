import java.util.ArrayList;
import java.util.List;

/**
 * RandomJava
 */
public class RandomJava {
  public List<Double> generados = new ArrayList<>();

  RandomJava(int n) {
    for (int i = 0; i < n; i++) {
      generados.add(Math.random());
    }

  }

  @Override
  public String toString() {
    String numeros = "";
    for (Double numero : generados) {
      numeros += numero + "\n";
    }
    return numeros;
  }
}

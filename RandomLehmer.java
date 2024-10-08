import java.util.ArrayList;

public class RandomLehmer {
  public ArrayList<Double> listaNumeros = new ArrayList<>();

  public RandomLehmer(int n) {
    System.out.print("Ingrese la semilla: ");
    int semilla = Proyecto1.scanner.nextInt();
    int aux, numAnterior;
    numAnterior = semilla;
    for (int y = 0; y < n; y++) {
      aux = (48271 * numAnterior) % ((int) Math.pow(2, 31) - 1);
      listaNumeros.add(Math.abs(aux / Math.pow(2, 31) - 1));
      numAnterior = aux;
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
  // public static void main(String[] args) {
  // int numInicial = 4808; // Semilla
  // int n = 10; // Cantidad de números
  // Integer[] arrayLehmer = new Integer[n];
  // arrayLehmer = lehmer(numInicial, n);

  // for (int x = 0; x < 50; x++) {
  // listaNumeros.add(arrayLehmer[x]);
  // }
  // }
}

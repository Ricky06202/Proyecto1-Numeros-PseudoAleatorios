import java.util.ArrayList;
public class RandomCuadradosMedios {
  public ArrayList<Double> listaNumeros = new ArrayList<>();

  public RandomCuadradosMedios(int n) {
    System.out.print("Ingrese la semilla: ");
    int semilla = Proyecto1.scanner.nextInt();
    int numPotencia, numDiv;
    int aux = semilla;
    listaNumeros.add(aux / 10000.0);
    for (int y = 0; y < n; y++) {
      numPotencia = (int) Math.pow(aux, 2);
      numDiv = numPotencia / 100;
      aux = numDiv % 10000;
      listaNumeros.add(aux / 10000.0);
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
  // int[] arrayCuadradosMedios = new int[n];

  // arrayCuadradosMedios = cuadradosMedios(numInicial, n);

  // for (int x = 0; x < n; x++) {
  // listaNumeros.add(arrayCuadradosMedios[x]);
  // }
  // }
}

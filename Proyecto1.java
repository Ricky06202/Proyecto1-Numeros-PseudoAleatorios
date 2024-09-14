import java.util.ArrayList;
import java.util.Scanner;

/**
 * Proyecto1
 */
public class Proyecto1 {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      int opcion = menu();
      System.out.print("Cantidad de Elementos aleatorios: ");
      int n = scanner.nextInt();
      ArrayList<Double> listaNumeros = null;
      switch (opcion) {
        case 1:
          listaNumeros = new RandomCuadradosMedios(n).listaNumeros;
          break;
        case 2:
          listaNumeros = new RandomLehmer(n).listaNumeros;
          break;
        case 3:
          listaNumeros = new RandomJava(n).listaNumeros;
          break;
        case 4:
          listaNumeros = new RandomExcel(n).listaNumeros;
          break;
        case 5:
          scanner.close();
          System.exit(0);
          break;
      }
      System.out.println();
      new PruebaMedias(listaNumeros);
      new PruebaVarianza(listaNumeros);
      new PruebaCorrida(listaNumeros);
      System.out.println();
    }
  }

  static int menu() {
    while (true) {
      System.out.println("1. Random Cuadrados Medios");
      System.out.println("2. Random Lehmer");
      System.out.println("3. Random Java");
      System.out.println("4. Random Excel");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opcion: ");
      int opcion = scanner.nextInt();
      if (opcion >= 1 && opcion <= 5)
        return opcion;
      System.out.println("Opción no valida");
    }
  }
}

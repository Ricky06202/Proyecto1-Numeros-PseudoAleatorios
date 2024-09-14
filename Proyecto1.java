import java.io.File;
import java.io.FileWriter;
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
      }
      System.out.println();
      new PruebaMedias(listaNumeros);
      new PruebaVarianza(listaNumeros);
      new PruebaCorrida(listaNumeros);
      System.out.println();

      if (opcion == 4)
        continue;

      if (deseaExportarLosNumeros())
        exportarNumeros(listaNumeros);
      else
        mostrarNumeros(listaNumeros);

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
      if (opcion == 5)
        System.exit(0);
      if (opcion >= 1 && opcion <= 4)
        return opcion;
      System.out.println("Opción no valida");
    }
  }

  static boolean deseaExportarLosNumeros() {
    while (true) {
      System.out.print("Desea exportar los datos en txt? (s/n): ");
      char respuesta = scanner.next().charAt(0);
      if (respuesta == 's' || respuesta == 'n') {
        return respuesta == 's';
      }
      System.out.println("Opción no valida");
    }
  }

  static void exportarNumeros(ArrayList<Double> lista) {
    try {
      String ruta = "Numeros.txt";
      File archivo = new File(ruta);
      FileWriter escritor = new FileWriter(archivo);
      for (Double numero : lista) {
        escritor.write(numero + "\n");
      }
      escritor.close();
      System.out.println("Numeros exportados correctamente");
    } catch (Exception e) {
      System.out.println("Error al exportar los datos");
    }
  }

  static void mostrarNumeros(ArrayList<Double> lista) {
    for (Double numero : lista) {
      System.out.println(numero);
    }
  }

}

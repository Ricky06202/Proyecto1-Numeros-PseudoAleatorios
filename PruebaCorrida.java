import java.util.ArrayList;

// Esta es una Prueba de Independencia

public class PruebaCorrida {
  public PruebaCorrida(ArrayList<Integer> lista) {
    int n = lista.size();
    // Si el número anterior es menor o igual se pone 0 sino 1
    int[] numAntInfSup = new int[n - 1];
    // Si en el anterior la secuencia es igual entonces se pone 1 sino 0
    int[] corrida0 = new int[n - 2];
    // Para obtener los datos de numAntInfSup
    for (int a = 0; a < n - 1; a++) {
      if (a == 0) {
        numAntInfSup[a] = 0;
      } else if (lista.get(a + 1) > lista.get(a)) {
        numAntInfSup[a] = 1;
      } else {
        numAntInfSup[a] = 0;
      }
    }
    // Para obtener los datos de corrida0
    for (int b = 0; b < n - 2; b++) {
      if (b == 0) {
        corrida0[b] = 0;
      } else if (numAntInfSup[b] == numAntInfSup[b - 1]) {
        corrida0[b] = 1;
      } else {
        corrida0[b] = 0;
      }
    }

    int sumaCorrida = 0;

    for (int c = 0; c < n - 2; c++) {
      if (corrida0[c] == 0) {
        sumaCorrida += 1;
      }
    }

    double mediaProblacional, varianza, desvEstandar;
    double nivelConfianza = 1.959963985;

    mediaProblacional = (2 * n - 1) / 3;
    varianza = (16 / n - 1) / 90;
    desvEstandar = (sumaCorrida - mediaProblacional) / Math.sqrt(varianza);

    boolean seAceptan = desvEstandar < nivelConfianza;
    System.out.print("Pueba de Corrida: ");
    System.out.println((seAceptan ? "Se aceptan" : "No se aceptan") + "los numeros aleatorios");
  }

}

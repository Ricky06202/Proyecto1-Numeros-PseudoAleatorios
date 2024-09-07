import java.util.ArrayList;
// esta es una Prueba de Uniformidad

public class PruebaVarianza {

  public PruebaVarianza(int n, ArrayList<Integer> lista) {
    int numSuma = 0, numero;
    double varianza, promedio, limiteInf = 0, limiteSup = 0, numSumaVar = 0;
    double nivelConfianza = 1.959963985;

    for (int x = 0; x < n; x++) {
      numSuma += lista.get(x);
    }
    promedio = numSuma / n;

    for (int y = 0; y < n; y++) {
      numero = lista.get(y);
      numSumaVar += (Math.pow((numero - promedio), 2));
    }
    varianza = numSumaVar / n;

    // pendiente

    boolean seAceptan = varianza > limiteInf && varianza < limiteSup;
    System.out.print("Pueba de Varianza: ");
    System.out.println((seAceptan ? "Se aceptan" : "No se aceptan") + "los numeros aleatorios");
  }
}

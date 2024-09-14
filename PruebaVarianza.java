import java.util.ArrayList;
// esta es una Prueba de Uniformidad

public class PruebaVarianza {

    public String PruebaDeVarianza(int n, ArrayList<Integer> lista) {
        String salida = "";
        int numSuma = 0, numero;
        double varianza, promedio, limiteInf = 0, limiteSup = 0, numSumaVar = 0;

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

        if (varianza > limiteInf && varianza < limiteSup) {
            salida = "Se aceptan los números aleatorios";
        } else {
            salida = "No se aceptan los números aleatorios";
        }
        return salida;
    }
}

import java.util.ArrayList;
// esta es una Prueba de Uniformidad

public class PruebaMedias {

    public String PruebaDeMedias(int n, ArrayList<Integer> lista) {
        String salida = "";
        int numSuma = 0;
        double promedio, limiteInf, limiteSup, nivelConfianza = 1.959963985;

        for (int x = 0; x < n; x++) {
            numSuma += lista.get(x);
        }
        promedio = numSuma / n;
        limiteInf = (0.5 - nivelConfianza) * (1 / Math.sqrt(12 * n));
        limiteSup = (0.5 + nivelConfianza) * (1 / Math.sqrt(12 * n));

        if (promedio > limiteInf && promedio < limiteSup) {
            salida = "Se aceptan los números aleatorios";
        } else {
            salida = "No se aceptan los números aleatorios";
        }
        return salida;
    }
}
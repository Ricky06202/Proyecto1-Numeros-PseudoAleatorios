import java.util.ArrayList;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;
// esta es una Prueba de Uniformidad

public class PruebaVarianza {

    public String PruebaDeVarianza(int n, ArrayList<Integer> lista) {
        String salida = "";
        int numSuma = 0, numero, gradosLibertad = n - 1;
        double numSumaVar = 0, alpha = 0.05;

        for (int x = 0; x < n; x++) {
            numSuma += lista.get(x);
        }
        double promedio = numSuma / n;

        // Calcular Varianza
        for (int y = 0; y < n; y++) {
            numero = lista.get(y);
            numSumaVar += (Math.pow((numero - promedio), 2));
        }
        double varianza = numSumaVar / (n - 1);

        // Función para el Chi cuadrado invertido
        ChiSquaredDistribution chiSquared = new ChiSquaredDistribution(gradosLibertad);

        // Calcula limite inferior y superior
        double chiCuadradoInferior = chiSquared.inverseCumulativeProbability(alpha / 2);
        double chiCuadradoSuperior = chiSquared.inverseCumulativeProbability(1 - alpha / 2);

        double limiteInf = (gradosLibertad * varianza) / chiCuadradoSuperior;
        double limiteSup = (gradosLibertad * varianza) / chiCuadradoInferior;

        if (varianza > limiteInf && varianza < limiteSup) {
            salida = "Se aceptan los números aleatorios";
        } else {
            salida = "No se aceptan los números aleatorios";
        }
        return salida;
    }
}

import java.util.ArrayList;
// esta es una Prueba de Uniformidad

public class PruebaMedias {

    public PruebaMedias(ArrayList<Double> lista) {
        int n = lista.size();
        int numSuma = 0;
        double promedio, limiteInf, limiteSup, nivelConfianza = 1.959963985;

        for (int x = 0; x < n; x++) {
            numSuma += lista.get(x);
        }
        promedio = numSuma / n;
        limiteInf = (0.5 - nivelConfianza) * (1 / Math.sqrt(12 * n));
        limiteSup = (0.5 + nivelConfianza) * (1 / Math.sqrt(12 * n));
        boolean seAceptan = promedio > limiteInf && promedio < limiteSup;
        System.out.print("Pueba de Medias: ");
        System.out.println((seAceptan ? "Se aceptan" : "No se aceptan") + "los numeros aleatorios");
    }
}

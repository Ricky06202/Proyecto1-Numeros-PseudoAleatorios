import java.util.ArrayList;
import java.util.List;

public class Lehmer {
    public static List<Long> listaNumLehmer = new ArrayList<>();

    public static long[] lehmer(int inicial, int n) {
        long[] arrayNumeros = new long[n];
        long aux, numAnterior;
        numAnterior = inicial;
        for (int y = 0; y < n; y++) {
            aux = (48271 * numAnterior) % ((int) Math.pow(2, 31) - 1);
            arrayNumeros[y] = aux;
            numAnterior = aux;
        }

        return arrayNumeros;
    }

    public static void main(String[] args) {
        int numInicial = 4808; // Semilla
        int n = 10; // Cantidad de números
        long[] arrayLehmer = new long[n];
        arrayLehmer = lehmer(numInicial, n);

        for (int x = 0; x < 50; x++) {
            listaNumLehmer.add(arrayLehmer[x]);
        }
    }
}

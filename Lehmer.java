import java.util.ArrayList;
import java.util.List;

public class Lehmer {
    public static List<Integer> listaNumLehmer = new ArrayList<>();

    public static Integer[] lehmer(int inicial, int n) {
        Integer[] arrayNumeros = new Integer[n];
        int aux, numAnterior;
        numAnterior = inicial;
        for (int y = 0; y < n; y++) {
            aux = (48271 * numAnterior) % ((int) Math.pow(2, 31) - 1);
            arrayNumeros[y] = (int) aux;
            numAnterior = aux;
        }

        return arrayNumeros;
    }

    public static void main(String[] args) {
        int numInicial = 4808; // Semilla
        int n = 10; // Cantidad de números
        Integer[] arrayLehmer = new Integer[n];
        arrayLehmer = lehmer(numInicial, n);

        for (int x = 0; x < 50; x++) {
            listaNumLehmer.add(arrayLehmer[x]);
        }
    }
}

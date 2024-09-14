import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Lehmer {
    public static List<Integer> listaNumLehmer = new ArrayList<>();

    public static int[] lehmer(int inicial, int n) {
        int[] arrayNumeros = new int[n];
        int aux, numAnterior;
        numAnterior = inicial;
        for (int y = 0; y < n; y++) {
            aux = (48271 * numAnterior) % ((int) Math.pow(2, 31) - 1);
            arrayNumeros[y] = Math.abs((int) aux);
            numAnterior = aux;
        }

        return arrayNumeros;
    }

    // public static void main(String[] args) {
    // int numInicial = 4808; // Semilla
    // int n = 10; // Cantidad de números
    // int[] arrayLehmer = new int[n];
    // arrayLehmer = lehmer(numInicial, n);

    // for (int x = 0; x < 50; x++) {
    // listaNumLehmer.add(arrayLehmer[x]);
    // }
    // }
}

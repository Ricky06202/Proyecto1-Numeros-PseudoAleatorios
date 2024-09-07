import java.util.ArrayList;
import java.util.List;

public class CuadraMedios {
    public static List<Integer> listaNumCuadrMedios = new ArrayList<>();

    public static int[] cuadradosMedios(int inicial, int n) {
        int numPotencia, numDiv;
        int aux = inicial;
        int[] arrayNumeros = new int[n];

        for (int y = 0; y < n; y++) {
            if (y == 0) {
                arrayNumeros[y] = inicial;
            } else {
                numPotencia = (int) Math.pow(aux, 2);
                numDiv = numPotencia / 100;
                aux = numDiv % 10000;
                arrayNumeros[y] = aux;
            }
        }
        return arrayNumeros;
    }

    public static void main(String[] args) {
        int numInicial = 4808; // Semilla
        int n = 10; // Cantidad de números
        int[] arrayCuadradosMedios = new int[n];

        arrayCuadradosMedios = cuadradosMedios(numInicial, n);

        for (int x = 0; x < n; x++) {
            listaNumCuadrMedios.add(arrayCuadradosMedios[x]);
        }
    }
}

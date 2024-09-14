import java.util.ArrayList;

/**
 * RandomExcel
 */
public class RandomExcel {
  public ArrayList<Double> listaNumeros = new ArrayList<>();

  RandomExcel(int n) {
    System.out.println("Pegue la lista de numeros: ");
    for (int i = 0; i < n; i++) {
      double numero = Proyecto1.scanner.nextDouble();
      listaNumeros.add(numero);
    }
  }

  @Override
  public String toString() {
    return listaNumeros.toString();
  }
}
/*
 * 0.1938
 * 0.7558
 * 0.1233
 * 0.5202
 * 0.0608
 * 0.3696
 * 0.6604
 * 0.6128
 * 0.5523
 * 0.5035
 * 0.3512
 * 0.3341
 * 0.1622
 * 0.6308
 * 0.7908
 * 0.5364
 * 0.7724
 * 0.6601
 * 0.5732
 * 0.8558
 * 0.2393
 * 0.7264
 * 0.7656
 * 0.6143
 * 0.7364
 * 0.2284
 * 0.2166
 */

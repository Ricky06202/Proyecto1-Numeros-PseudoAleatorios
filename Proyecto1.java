import java.util.Scanner;

/**
 * Proyecto1
 */
public class Proyecto1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa la cantidad de elementos: ");
    int n = scanner.nextInt();
    System.out.println(new RandomExcel(n));
    scanner.close();
  }
}

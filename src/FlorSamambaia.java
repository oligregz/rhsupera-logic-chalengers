import java.util.Scanner;

public class FlorSamambaia {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // sequência ex para rico 10, 0, 0, 4, 2, 2

    System.out.println("Digite um valor para r1");
    int r1 = sc.nextInt();

    System.out.println("Digite um valor para x1");
    int x1 = sc.nextInt();

    System.out.println("Digite um valor para y1");
    int y1 = sc.nextInt();

    System.out.println("Digite um valor para r2");
    int r2 = sc.nextInt();

    System.out.println("Digite um valor para x2");
    int x2 = sc.nextInt();

    System.out.println("Digite um valor para y2");
    int y2 = sc.nextInt(); 
    
    tentativaDesenhar(r1, x1, y1, r2, x2, y2);

    sc.close();
  }

  public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
    double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    
    if (distanciaCentros + r2 <= r1) {
      System.out.println("RICO");
      return "RICO";
    }

    System.out.println("MORTO");
    return "MORTO";
  }
}


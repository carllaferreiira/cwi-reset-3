import java.util.Scanner;

public class TesteDeclarcaoScanner {
  public static void main(String[] args) {
    //L? a partir da linha de comando
    Scanner sc1 = new Scanner(System.in);
    String textoString = "Maria Silva";
    //L? a partir de uma String
    Scanner sc2 = new Scanner(textoString);
  }
}
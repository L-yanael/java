package M2_exercice;

import java.util.Scanner;

public class M2_E4 {
  public static void main(String[] args) {

    System.out.println("Quelle couleur souhaitez-vous ?");
    Scanner clavier = new Scanner(System.in);

    String couleur = clavier.nextLine(); // lecture de la couleur
    clavier.close();

    // tester la couleur
    if (couleur.equalsIgnoreCase("bleu")) {
      System.out.println("Vous avez choisi le bleu.");
    } else if (couleur.equalsIgnoreCase("rouge")) {
      System.out.println("Vous avez choisi le rouge.");
    } else {
      System.out.println("Connais pas");
    }
  }
}

package M2_exercice;
import java.util.Scanner;

public class M2_E1 {
    public static void main(String[] args) {

      System.out.print("Entrez un nombre :");
      Scanner clavier = new Scanner(System.in);
      int nb = clavier.nextInt();
      clavier.close();

      if ( nb %2 == 0 ) { // test si nb est pair == reste de la division par 2 est 0
        System.out.println("Le nombre " + nb + " est pair.");
      } else {
        System.out.println("Le nombre " + nb + " est impair.");
      }

  }
}
  
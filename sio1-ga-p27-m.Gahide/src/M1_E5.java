import java.util.Random;
import java.util.Scanner;


public class M1_E5 {
   public static void main(String[] args) throws Exception {

        Random random = new Random();
        int nombreMystere = random.nextInt(100) + 1; // nombre entre 1 et 100 inclus

        Scanner scanner = new Scanner(System.in);

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.print("Entrez un nombre : ");
        int proposition = scanner.nextInt();

        System.out.println("Vous proposez : " + proposition);
        System.out.println("Le nombre auquel je pensais était : " + nombreMystere);
        System.out.println("Vous étiez à " + Math.abs(nombreMystere - proposition) + " de la bonne réponse.");
        
        scanner.close();
    }
}

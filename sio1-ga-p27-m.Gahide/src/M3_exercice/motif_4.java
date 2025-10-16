package M3_exercice;

public class motif_4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) { // boucle pour afficher les nombres de 1 à i

                System.out.print(i + ""); // affiche i + concatenation d'un espace
            }
            System.out.println(); // saut de ligne
        }
    }
}
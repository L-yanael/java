
package M3_exercice;

public class motif_3 {
    public static void main(String[] args) {

        String etoile = "*";
        // initialisation de la variable *

        for (int i = 1; i <= 5; i++) {
            // initialeisation de la variable i, condition de continuation, incrémentation
            // de i

            System.out.println(etoile); // affiche i + concatenation d'un espace
            etoile = etoile + "*"; // je prends la valeur de etoile, j'ajoute une étoile
        }

    }

}

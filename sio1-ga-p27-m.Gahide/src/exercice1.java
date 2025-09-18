import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) throws Exception {

    // Initialisation du Scanner pour le clavier
    Scanner clavier = new Scanner(System.in);

    //1. Récupération du premier nom commun
    // next attend une entrée au clavier
    System.out.print("Entrez le premier nom commun : ");
    String NOM1 = clavier.next();

    //2. Récupération du nombre
    // nextInt attend une entrée au clavier
    System.out.print("Entrez un nombre : ");
    int NOMBRE = clavier.nextInt();

    //3. Récupération du second nom commnun

    System.out.print("Entrez un deuxième nom commun : ");
    String NOM2 = clavier.next();

    //4. Récupération de l'adjectif

    System.out.print("Entrez un adjectif : ");
    String ADJECTIF = clavier.next();

    // On "ferme" la ressource clavier
    clavier.close();
    
    // Afficher la phrase
    System.out.println("Il était une fois un " + NOM1 + " qui avait " + NOMBRE + " " + NOM2 + ". Cela le rendait très " + ADJECTIF + ".");
    }
}

import java.util.Scanner;

public class M1_E2 {
    public static void main(String[] args) throws Exception {

    // Initialisation du Scanner pour le clavier
    Scanner clavier = new Scanner(System.in);


    System.out.print("Entrez les heures : ");
    int heures = clavier.nextInt();

    System.out.print("Entrez les minutes : ");
    int minutes = clavier.nextInt();

    System.out.print("Entrez les secondes : ");
    int secondes = clavier.nextInt();
    
        
    // Calcul du nombre total de secondes écoulées depuis minuit
    int totalSecondes = heures * 3600  + minutes * 60 + secondes;
    // On "ferme" la ressource clavier
    clavier.close();

    System.out.println("Il est" + " " + heures + " " + "h" + " "  + minutes + " " + "min" + " " + secondes + " " + "s"); 
    System.out.println("Il s'est écoulé" + " " + totalSecondes + "s depuis minuit.");

 } 
}
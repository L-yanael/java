import java.util.Scanner;

public class M1_E3 {
    public static void main(String[] args) throws Exception {

    // Initialisation du Scanner pour le clavier
    Scanner clavier = new Scanner(System.in);

    System.out.print("Entrez les heures : ");
    int heures = clavier.nextInt();

    System.out.print("Entrez les minutes : ");
    int minutes = clavier.nextInt();

    System.out.print("Entrez les secondes : ");
    int secondes = clavier.nextInt();
        

    int total = heures * 3600 + minutes * 60 + secondes;  // secondes écoulées depuis minuit
    int totalSecondes = 86400 - total;  // secondes restantes avant minuit

    // On "ferme" la ressource clavier
    clavier.close();

    System.out.println("Il est" + " " + heures + " " + "h" + " "  + minutes + " " + "min" + " " + secondes + " " + "s."); 
    System.out.println("Il y a encore" + " " + totalSecondes + "s avant minuit.");

 } 
}
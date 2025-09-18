import java.util.Scanner;

public class M1_E4 {
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

    // On "ferme" la ressource clavier
    clavier.close();

    System.out.println("Il est" + " " + heures + " " + "h" + " "  + minutes + " " + "min" + " " + secondes + " " + "s."); 
    System.out.println("Il y a encore" + " " + total + "s avant minuit.");

 } 
}
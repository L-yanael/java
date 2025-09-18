
public class M1_E1 {
    public static void main(String[] args) throws Exception {
    // Déclaration des variables "en dur"
    int heures = 12;
    int minutes = 34;
    int secondes = 56;
      
    // Calcul du nombre total de secondes écoulées depuis minuit
    int totalSecondes = heures * 3600 + minutes * 60 + secondes;

    // Afficher l'heure statique
    System.out.println("Il est" + " " + heures + " " + "h" + " "  + minutes + " " + "min" + " " + secondes + " " + "s"); 

    System.out.println("Il s'est écoulé" + " " + totalSecondes + "s depuis minuit.");


 } 
}
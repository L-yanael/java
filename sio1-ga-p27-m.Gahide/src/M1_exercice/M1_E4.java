package M1_exercice;

public class M1_E4 {
    public static void main(String[] args) throws Exception {

    int heuresEcoulee =15;
    int minutesEcoulee =27;
    int secondesEcoulee =12;
    int heures = 24 - heuresEcoulee - 1;  // heures restantes avant minuit
    int
    int

    float PourcentageTemps = 


     heuresJournées = 86400;

    int total = heures * 3600 + minutes * 60 + secondes;  // pourcentage écoulé depuis tout à l’heure (12:34:56)
    int totalSecondes = 86400 - total;  // secondes restantes avant minuit


    System.out.println("Il est" + " " + heures + " " + "h" + " "  + minutes + " " + "min" + " " + secondes + " " + "s."); 
    System.out.println("Il y a encore" + " " + total + "s avant minuit.");

 }
}
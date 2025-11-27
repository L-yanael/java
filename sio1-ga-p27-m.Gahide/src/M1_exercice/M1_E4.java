package M1_exercice;

public class M1_E4 {
    public static void main(String[] args) throws Exception {

        int heuresEcoulee = 15;
        int minutesEcoulee = 27;
        int secondesEcoulee = 12;

        // total écoulé depuis minuit
        int totalEcoule = heuresEcoulee * 3600 + minutesEcoulee * 60 + secondesEcoulee;

        // total de la journée
        int totalJournee = 86400;

        // secondes restantes
        int secondesRestantes = totalJournee - totalEcoule;

        // pourcentage écoulé
        float pourcentageTemps = (totalEcoule * 100.0f) / totalJournee;

        System.out.println("Il est " + heuresEcoulee + " h " + minutesEcoulee + " min " + secondesEcoulee + " s.");
        System.out.println("Il reste " + secondesRestantes + " s avant minuit.");
        System.out.println("Pourcentage de la journée écoulée : " + pourcentageTemps + "%");
    }
}

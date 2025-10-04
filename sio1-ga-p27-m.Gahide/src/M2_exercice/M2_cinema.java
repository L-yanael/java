package M2_exercice;

public class M2_cinema {
    public static void main(String[] args) {

        // Données codées en dur

        int age = 13; // Âge de la personne
        int accompagne = 1; // 1 = oui (accompagné), 0 = non (seul)
        int interdit = 0; // 1 = interdit de cinéma, 0 = autorisé

        // Conditions d'entrée au cinéma

        // Si la personne n'est PAS interdite (interdit == 0)
        // ET (elle a au moins 14 ans OU elle est accompagnée)
        if (interdit == 0 && (age >= 14 || accompagne == 1)) {
            System.out.println("Entrée autorisée");
        } else {
            System.out.println("Entrée refusée");
        }
    }
}

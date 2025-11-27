package M4_exercice;

import java.util.Random;

public class M4_exericeRPG {

    static Random rand = new Random();

    public static void main(String[] args) {
        afficherBienvenue();
        combattant("Chun-Li");
        caracteristiques("Chun-Li", 20, 30, 100);
        attaque("Chun-Li");
    }

    // Exercice 1
    public static void afficherBienvenue() {
        System.out.println("Bienvenue !");
    }

    // Exercice 2
    public static void combattant(String nom) {
        System.out.println("Le combattant " + nom + " entre dans le combat.");
    }

    // Exercice 3
    public static void caracteristiques(String nom, int force, int agilite, int pointsDeVie) {
        System.out.println("Caractéristiques de " + nom + " :");
        System.out.println("Force : " + force);
        System.out.println("Agilité : " + agilite);
        System.out.println("Points de vie : " + pointsDeVie);
    }

    public static int attaque(String nom) {
        int degats = rand.nextInt(50, 101); // 50 à 100 inclus
        System.out.println(nom + " inflige " + degats + " points de dégâts.");
        return degats;
    }

    public static int renvoieDegats(int degats) {

    }

}
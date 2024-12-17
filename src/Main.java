
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int id;
      String nom, prenom, email;
        int choix;


        // Affichage du menu principale
        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n==== Menu de Gestion des Taches ====\n");
            System.out.println(" 1. Gestion des Apprenants\n");
            System.out.println(" 2. Gestion des Formateurs\n");
            System.out.println(" 3.  Gestion des Classes\n");
            System.out.println(" 0. Quitter\n");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir!");
                choix = 0;


            }
            switch (choix) {
                case 1:
                    System.out.println("Gestion des Apprenants");
                    break;
                case 2:
                    System.out.println("Gestion des Formateurs");
                    break;
                case 3:
                    System.out.println("Gestion des Classes");
                    break;
            }

        }
    }


        }



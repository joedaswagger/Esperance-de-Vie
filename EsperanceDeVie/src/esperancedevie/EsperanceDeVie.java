/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esperancedevie;

import java.util.Scanner;

/**
 *
 * @author Keshishian, Joseph
 * Date: 13 septembre 2021
 * Fichier: EsperanceDeVie.java
 * 
 * Le but de ce programme est de calculer l'espérance de vie en tenant compte si tu es un fumeur, 
 * ta pression sanguine et le nombre de bleuets que tu manges par année.
 * 
 */
public class EsperanceDeVie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int ÉsperanceDeVie = 80;
        /**
         * Ce variable est l'espérance de vie de base, qui est 80.
         */
        final int Fume = -10;
        /**
         * Ce variable représente la variable du fumeur. Si tu fumes, ce variable est utilisé qui soustrait 10 ans de ton espérance de vie.
         */
        int PressionSanguine;
        /**
         * Ce variable est la pression sanguine que tu écris dans la console.
         */
        int NbBleuets;
        /**
         * Ce variable est le nombre de bleuets que tu manges par année que tu écris dans la console.
         */
        int EdV2;
        /**
         * Ce variable est l'espérance de vie après la première question.
         */
        int EdV3;
        /**
         * Ce variable est l'espérance de vie après la deuxième question.
         */
        Scanner clavier = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        System.out.println("Est-ce que vous fumez? Répondez avec O=Oui et N=Non.");
        String smoke = text.nextLine();
        System.out.println("C'est quoi votre pression sanguine?");
        PressionSanguine = clavier.nextInt();
        System.out.println("Vous mangez combien de portions de bleuets par année?");
        NbBleuets = clavier.nextInt();

        if ((smoke.equals("O")) || (smoke.equals("o"))) {
            EdV2 = ÉsperanceDeVie + Fume;

            int MauvaisPression = ((PressionSanguine - 120) / 20) * 2;
            if (PressionSanguine > 120) {
                EdV3 = EdV2 - MauvaisPression;
             if (NbBleuets > 12) {
                System.out.println("Votre espérance de vie est: " + (EdV3 + 2));
             } else if (NbBleuets < 12) {
                 System.out.println("Votre espérance de vie est: " + EdV3);
             }
            } else if (PressionSanguine <= 120) {
                EdV3 = EdV2;
                if (NbBleuets > 12) {
                    System.out.println("Votre espérance de vie est: " + (EdV3 + 2));
                } else if (NbBleuets < 12) {
                    System.out.println("Votre espérance de vie est: " + EdV3);
        }
            
        }

         

        }
        else if ((smoke.equals("N")) || (smoke.equals("n"))) {
          EdV2 = ÉsperanceDeVie;

            int MauvaisPression = ((PressionSanguine - 120) / 20) * 2;
            if (PressionSanguine > 120) {
                EdV3 = EdV2 - MauvaisPression;
             if (NbBleuets > 12) {
                System.out.println("Votre espérance de vie est: " + (EdV3 + 2));
             } else if (NbBleuets < 12) {
                 System.out.println("Votre espérance de vie est: " + EdV3);
             }
            } else if (PressionSanguine <= 120) {
                EdV3 = EdV2;
                if (NbBleuets > 12) {
                    System.out.println("Votre espérance de vie est: " + (EdV3 + 2));
                } else if (NbBleuets < 12) {
                    System.out.println("Votre espérance de vie est: " + EdV3);
        }

            } else {
                System.out.println("SVP Répondez avec O/N");
            }
    
    }
    
}
}

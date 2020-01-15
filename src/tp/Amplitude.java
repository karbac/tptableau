/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Amplitude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // initialisation des constantes
        final int NL = 5;
        final int NC = 2;
        // initalisation des variables
        int min , max , amp;
        // création du tableau
        int[][] tab = new int[NL][NC];
        
        // lecture du tableau
        for(int i = 0 ; i < NL ; i++){
            for(int j = 0 ; j < NC ; j++){
                System.out.print("Entrez un entier : ");
                tab[i][j] = reader.nextInt();
            }
        }
        
        // Recherche du plus petit et du plus grand élément du tableau
        max = tab[0][0];
        min = tab[0][0];       
        for(int i = 0 ; i < NL ; i++){
            for(int j = 0 ; j < NC ; j++){
                if( tab[i][j] > max ) {
                    max = tab[i][j];
                }
                else if ( tab[i][j] < min ){
                    min = tab[i][j];
                }
            }
        }
        // Calcul de l'amplitude
        amp = max - min;
        // Affichage
        
        System.out.printf("%nAmplitude du tableau : %d%n" , amp);
    }
}

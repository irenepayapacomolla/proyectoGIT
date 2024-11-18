/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ciclost
 */
public class PracticaDepuracion {
        public static void main(String[] args) {
            String frase = "En Andalucía y en Asturias se acerca el invierno";
            int contador = 0;
            System.out.println(frase);
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
                    contador++;
                }
            }
            System.out.println("Total vocales = "+contador);
        }
    
}

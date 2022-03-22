package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fraseReversa = "", fraseSinEspacios = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
           //hacer un if para quitar los espacios
        }


        for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
            fraseReversa += fraseSinEspacios.charAt(i);
        }

        if (fraseSinEspacios.equals(fraseReversa)) {
            System.out.print("Tu frase es un palindromo.");
        } else {
            System.out.print("Tu frase no es un palindromo.");
        }


    }
}

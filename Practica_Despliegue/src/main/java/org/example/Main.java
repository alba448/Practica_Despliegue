package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es primo: ");
        int numero = scanner.nextInt(); // Lee el número ingresado por el usuario.

        // Verifica si el número ingresado es primo e imprime el resultado.
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        scanner.close(); // Cierra el scanner para liberar el recurso.
    }

    /**
     * Verifica si un número dado es primo.
     * Un número primo es aquel que no tiene divisores positivos
     * distintos de 1 y de sí mismo.
     *
     * @param numero El número a verificar.
     * @return {@code true} si el número es primo; {@code false} en caso contrario.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos.
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
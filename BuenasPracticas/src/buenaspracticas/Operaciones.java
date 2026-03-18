/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buenaspracticas;

/**
 *
 * @author User
 */
public class Operaciones {

    /**
     * Calcula el promedio de un arreglo de números
     */
    public static double calcularPromedio(int[] numeros) {

        // Verifico que no esté vacío
        if (numeros == null || numeros.length == 0) {
            return 0;
        }

        int sumaTotal = 0;

        // Recorro el arreglo
        for (int numero : numeros) {
            sumaTotal += numero;
        }

        return (double) sumaTotal / numeros.length;

        
    }
}

package modelamiento.ejercicio3;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainNumerosReales {

    public static void main(String[] args) {
        NumerosAleatorios numerosAleatorios = new NumerosAleatorios();
        Scanner sc = new Scanner(System.in);
        int escoja;
        int nroElementos;
        nroElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de números reales que desea ordenar"));

        numerosAleatorios.insertarNumerosReales(nroElementos);

        escoja = Integer.parseInt(JOptionPane.showInputDialog("Si desea ordenar los números por el metodo burbuja escriba : 1 " +
                ".Si desea escribir los números por el método quick sort escriba: 2"));




        if (escoja == 1) {

            System.out.println("\n\t\tLISTA DESORDENADO \n");
            System.out.println(Arrays.toString(numerosAleatorios.getNumerosReales()));
            System.out.println("\n\t\tLISTA ORDENADO CON EL METODO DE BURBUJA\n");
            System.out.println(Arrays.toString(numerosAleatorios.metodoBurbuja()));
            System.out.println("\n");


        } else if (escoja == 2){

            System.out.println("\n\t\tLISTA ORDENADA CON EL METODO DE QUICKSORT\n");
            System.out.println(Arrays.toString(numerosAleatorios.ordenarQuickSort()));
        } else {
            System.out.println("opcion3");
            System.out.println(" Esta opción no existe, intente nuevamente");
        }
    }
}

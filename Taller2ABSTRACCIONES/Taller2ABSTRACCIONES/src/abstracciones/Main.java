package abstracciones;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res ="Si";
        while (Objects.equals(res, "Si")) {

            System.out.println("Ingrese la nave que desea crear: " +
                    "apolo, " +
                    "pionero, " +
                    "mariner o " +
                    "saturno.");
            String nave = sc.nextLine();

            switch (nave) {
                case "apolo": {
                    Apolo apolo = new Apolo((float) 10.2,689,4170);
                    apolo.mision();
                    apolo.timeStart();
                    apolo.tanquear();
                    apolo.takeOff();
                    apolo.convertToGrams();
                    break;
                }
                case "pionero": {
                    PioneroX pionero = new PioneroX(3,106,258);
                    pionero.definition();
                    pionero.timeStart();
                    pionero.tanquear();
                    pionero.takeOff();
                    System.out.println(pionero);
                    pionero.finalWeight();
                    break;
                }
                case "mariner": {
                    MarinerIV marinerIV = new MarinerIV((float) 45.7,170,260);
                    marinerIV.mision();
                    marinerIV.tanquear();
                    marinerIV.takeOff();
                    marinerIV.endMision();
                    break;
                }
                case "saturno": {
                    SaturnoV saturnoV = new SaturnoV((float)110.6,35450,2970000);
                    saturnoV.description();
                    saturnoV.tanquear();
                    saturnoV.takeOff();
                    saturnoV.metersToCentimeters();
                    break;
                }
                default: {
                    System.out.println("Esta nave no existe");
                }
            }
            System.out.println("************************************//*****************************************");
            System.out.println("¿Desea crear una nueva nave?" +
                    " R/ Escriba 'Si' o 'No' ");
            String response = sc.nextLine();
            res = response;

        }




    }
}

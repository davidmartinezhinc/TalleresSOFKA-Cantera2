package modelamiento.ejercicio4;

import java.util.List;
import java.util.Scanner;

public class Vehiculo {
    private String placa;
    private int nroPasajeros ;
    private int nroRuedas;
    private String color;
    private String marca;

    public Vehiculo() {

    }

    public Vehiculo(String placa, int nroPasajeros, int nroRuedas, String color, String marca) {
        this.placa = placa;
        this.nroPasajeros = nroPasajeros;
        this.nroRuedas = nroRuedas;
        this.color = color;
        this.marca = marca;

    }

    public void ingresarVehiculos(List<Vehiculo> vehiculos) {
             Scanner sc = new Scanner(System.in);
             Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa placa del vehículo");
            this.placa = sc.nextLine();
            System.out.println("Ingresa número de pasajeros");
            this.nroPasajeros = sc2.nextInt();
            System.out.println("Ingresa número de ruedas del vehiculo");
            this.nroRuedas = sc2.nextInt();
            System.out.println("Ingresa color del vehículo");
            this.color = sc.nextLine();
            System.out.println("Ingresa marca del vehículo");
            this.marca = sc.nextLine();

            Vehiculo vehiculo = new Vehiculo(this.placa,this.nroPasajeros,this.nroRuedas,this.color,this.marca);

            vehiculos.add(vehiculo);
        }


    }
    public void mostrarVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo1 : vehiculos){
            System.out.println(vehiculo1);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", nroPasajeros=" + nroPasajeros +
                ", nroRuedas=" + nroRuedas +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

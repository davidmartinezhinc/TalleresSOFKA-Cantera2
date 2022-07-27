package modelamiento.ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainVehiculo {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculo.ingresarVehiculos(vehiculos);

        System.out.println("\n\t\tLISTA DE LOS DATOS DE DIEZ VEHÍCULOS REGISTRADOS\n");
        vehiculo.mostrarVehiculos(vehiculos);
    }
}

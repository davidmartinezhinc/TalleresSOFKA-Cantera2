package sofka.clase.empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

     public static void main(String[] args) {
         Employee employee = new Employee();
         Employee employee2 = new Employee("David","martinez",3000000);
         List<Employee> employees = new ArrayList<>();

         String nombre = employee2.getName();
         String apellidos = employee2.getLastName();
         int sueldo = employee2.getSalary();


//         System.out.println(empleado);
     //   System.out.println(employee2);
         System.out.println(nombre);
//
//         empleado2.setNombre("Pedro");
//         empleado2.setApellidos("Perez");
//
//         System.out.println(empleado2.getNombre());
//         System.out.println(empleado2.getApellidos());

         Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         String apellido3 = sc.nextLine();
         int sueldo3 = sc.nextInt();
         int antiguedad = sc.nextInt();

         Employee employee3 = new Employee(name,apellido3,sueldo3,antiguedad);
         System.out.println(employee3);

         employees.add(employee);
         employees.add(employee2);
         employees.add(employee3);

         for (Employee employee1 : employees){
             System.out.println(employee1);
         }
    }
}

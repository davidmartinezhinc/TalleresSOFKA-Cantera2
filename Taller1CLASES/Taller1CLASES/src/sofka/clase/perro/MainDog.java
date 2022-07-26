package sofka.clase.perro;

import java.util.Scanner;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Doberman","Danger",5,false);
        System.out.println("Ingresa los datos del perro");
        Scanner sc = new Scanner(System.in);
        String race1 = sc.nextLine();
        String name1 = sc.nextLine();
        int age1 = sc.nextInt();
        boolean status1 = sc.hasNext();
        Dog dog1 = new Dog(race1,name1,age1,status1);
        System.out.println(dog1);
        System.out.println(dog);

        dog.statusDog();
        dog.wakeUp();
        dog.statusDog();
        String name2 = dog.getName();
        int age2= dog.convertAge();
        System.out.println("La edad en años perro de "+name2+" es "+age2);

        dog1.statusDog();
        dog1.sleep();
        dog1.statusDog();

      int age3= dog1.convertAge();
        System.out.println("La edad en años perro de "+name1+" es "+age3);
    }
}

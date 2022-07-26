package sofka.clase.persona;

import java.util.Date;

public class MainPerson {
    public static void main(String[] args){
    Person person = new Person();
    Date date = new Date();
    Person person1 = new Person("David","Martinez","Hincapie",date, 25);
    person.showName();
        System.out.println(person);
         System.out.println(person1);

         String name1= person1.getName();
        System.out.println(name1);
    }
}

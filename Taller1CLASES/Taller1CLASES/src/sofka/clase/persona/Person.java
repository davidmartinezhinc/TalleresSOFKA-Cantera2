package sofka.clase.persona;

import java.util.Date;
/**
 * Representa una persona, el cual realiza acciones  sencillas como mostrar un mensaje con el nombre completo
 *
 * @autor David Martinez Hincapié
 */
public class Person {
    /**
     * Representa el nombre de la clase Persona
     */
    public String name;
    /**
     * Representa la variable que guarda el primer apellido de la persona
     */
    public String lastName1;
    /**
     * Representa la variable que guarda el segundo apellido de la persona
     */
    public String lastName2;
    /**
     * Representa la variable que guarda la fecha del cumpleaños de la persona
     */
    public Date dateBirth;
    /**
     * Representa la variable que guarda la altura de la persona
     */
    public float height;

    /**
     * Se crea una instancia donde se le asigna un nombre a la variable name de ese objeto
     */
    public Person() {
        name="juan";
    }

    /**
     * Es el constructor de esta clase con sus propiedades
     * @param name Primer atributo de la clase persona
     * @param lastName1 Segundo atributo de la clasepersona
     * @param lastName2 Tercer atributo de la clase persona
     * @param dateBirth Cuarto atributo de la clase persona
     * @param height Quinto atributo de la clase persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    /**
     * Acá se generaron los getters and setters de las 5 propiedades que tiene la clase Person
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    /**
     * Es la función encargada de mostrar el nommbre completo que está por defecto
     */
    protected void showName(){
        System.out.println("Mi nombre es David Martinez");

    }
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    /**
     * Retorna todos los valores de los atributos como String debidamente ordenados a la hora de imprimir
     * @return
     */

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}

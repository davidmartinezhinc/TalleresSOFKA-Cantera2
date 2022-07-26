package sofka.clase.fruta;

import java.util.ArrayList;
/**
 * Representa la clase fruta, donde se le agrega varios colores a una fruta en especifico
 *
 * @autor David Martinez Hincapié
 */
public class Fruit {
    /**
     * Representa el nombre de un objeto fruta
     */
    public String name;
    /**
     * Representa el peso medio de la fruta
     */
    private float averageWeight;
    /**
     * Es la lista donde se guardan los colores para cada fruta
     */
    public ArrayList<String> colors;
    /**
     * Se crea una instancia de la clase Employee
     */
    public Fruit(){

    }

    /**
     * Es la función que se encarga de recibir un color y agregarlo a la lista de Colors
     * @param color Es el parametro que recibe el color enviado desde la clase principal
     */
    public void addColor(String color){
        colors.add(color);
    }

    /**
     * Es el constructor de esta clase con sus propiedades
     * @param name Primer atributo de la clase
     * @param averageWeight Segundo atributo de la clase
     */
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = new ArrayList<>();
    }


    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /**
     * Retorna todos los valores de los atributos como String debidamente ordenados a la hora de imprimir
     * @return
     */
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }


    /**
     * Acá se generaron los getters and setters de las 4 propiedades que tiene la clase Fruit
     * @return
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }



}

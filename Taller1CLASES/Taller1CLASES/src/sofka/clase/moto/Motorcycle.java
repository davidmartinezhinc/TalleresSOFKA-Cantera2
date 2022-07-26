package sofka.clase.moto;

/**
 * Representa una moto que hace funciones sencillas como encender y apagar
 *
 * @autor David Martinez Hincapié
 */
public class Motorcycle {
    /**
     * Representa la propiedad la placa o número de matrícula de una moto
     */
    private String plate;
    /**
     * Representa la propiedad la marca de una moto
     */
    private String brand;
    /**
     * Representa la propiedad color de una moto
     */
    private String color;
    /**
     * Representa el estado en que se encuentra la moto, si está apagada o prendida.
     */
    private boolean status;

    protected void statusOn(){
        System.out.println("The motorcycle is on");
    }
    protected void statusOff(){
        System.out.println("Bike is switched off");
    }

    /**
     * Es el constructor de esta clase con sus propiedades
     * @param plate Primer atributo de la clase moto
     * @param brand  Segundo atributo de la clase moto
     * @param color Tercer atributo de la clase moto
     * @param status Cuarto atributo de la clase moto
     */
    public Motorcycle(String plate, String brand, String color, boolean status) {
        this.plate = plate;
        this.brand = brand;
        this.color = color;
        this.status = status;
    }

    /**
     * Retorna todos los valores de los atributos como String debidamente ordenados a la hora de imprimir
     * @return
     */
    @Override
    public String toString() {
        return "Motorcycle{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", status=" + status +
                '}';
    }

    /**
     * Acá se generaron los getters and setters de las 4 propiedades que tiene la clase Motorcycle
     * @return
     */
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

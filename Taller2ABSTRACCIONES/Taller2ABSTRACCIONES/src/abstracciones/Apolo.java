package abstracciones;

public class Apolo extends Nave{

    public Apolo(float length, float thrust, float totalWeight) {
        super(length,  thrust, totalWeight);
    }


    public Apolo() {
        super();
    }

    public void mision(){
        System.out.println("La nave apolo fue diseñada para enviar un hombre a la luna y traerlo de regreso" +
                "sano y salvo a la tierra.");
    }
    public void convertToGrams(){
        this.totalWeight = this.totalWeight * 1000;
        System.out.println("La nave apolo pesa en gramos un total de "+this.totalWeight+" gramos");
    }
    @Override
    public void timeStart() {
       this.time= this.time + 5;
        System.out.println("La nave se demora "+time+" minutos para encender completamente");
    }

    @Override
    public void tanquear() {
        this.fuel = this.fuel + 2000;
        System.out.println("Esta nave para la primera etapa necesitó de más de "+fuel+" toneladas " +
                "de diversos combustibles");
    }

    @Override
    public void takeOff() {
        System.out.println("La nave Apolo despegará en tan solo unos segundos");
    }
}

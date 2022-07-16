package abstracciones;

public class PioneroX extends Nave{
    public PioneroX(float length, float thrust, float totalWeight) {
        super(length, thrust, totalWeight);
    }

    public PioneroX() {

    }

    @Override
    public void timeStart() {
        time=10;
        System.out.println("La nave se demora "+time+" minutos para encender completamente");
    }
    @Override
    public void tanquear() {
        this.fuel = this.fuel + 5000;
        System.out.println("Esta nave para la primera etapa necesitó de más de "+fuel+" toneladas de diversos combustibles");
    }

    @Override
    public void takeOff() {
        System.out.println("La nave Pionero X despegará en tan solo unos segundos");
    }


    public void definition() {
        System.out.println("Es una sonda espacial o dispositivo artificial como los satelites." +
                "Fue la primera en llegar al planeta Jupiter");
    }

    public void finalWeight() {
        this.totalWeight = this.totalWeight + 28 - 60 - 26;
        System.out.println("El peso final de la nave o sonda es de "+this.totalWeight+" kilogramos");
    }
}

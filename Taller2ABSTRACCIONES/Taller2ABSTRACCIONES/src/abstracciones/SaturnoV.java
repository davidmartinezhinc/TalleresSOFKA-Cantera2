package abstracciones;

public class SaturnoV extends Nave{

    public SaturnoV(float length, float thrust, float totalWeight) {
        super(length, thrust, totalWeight);
    }

    public SaturnoV() {

    }

    @Override
    public void tanquear() {
        this.fuel = this.fuel + 15000;
        System.out.println("Esta nave para la primera etapa necesitó de más de "+fuel+" toneladas de diversos combustibles");
    }

    @Override
    public void takeOff() {
        System.out.println("La nave Saturno V despegará en tan solo unos segundos");
    }

    public void description() {
        System.out.println("El Saturno V fue un cohete desechable creado principalmente para impulsar la nave Apolo." +
                "Tambien fue usado para lanzar la estación espacial SkyLab.");
    }
    public void metersToCentimeters(){
        this.length = this.length * 100;
        System.out.println("La altura del cohete en centimetros es "+this.length+" centimetros.");
    }
}

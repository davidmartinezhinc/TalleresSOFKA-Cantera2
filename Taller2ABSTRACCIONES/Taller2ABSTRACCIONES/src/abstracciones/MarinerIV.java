package abstracciones;

public class MarinerIV extends Nave{
    public MarinerIV(float length, float thrust, float totalWeight) {
        super(length, thrust, totalWeight);
    }

    public MarinerIV() {

    }

    @Override
    public void tanquear() {
        this.fuel = this.fuel + 8000;
        System.out.println("Esta nave para la primera etapa necesitó de más de "+fuel+" toneladas de diversos combustibles");
    }

    @Override
    public void takeOff() {
        System.out.println("La nave Mariner IV despegará en tan solo unos segundos");
    }

    public void mision() {
        System.out.println("Era una nave espacial cuya misión sería la de explorar los planetas de Venus, Marte y Mercurio por primera vez," +
                " y volviendo a Venus y Marte para una exploración más detallada. ");
    }

    public void endMision() {
        this.fuel = 0;
        System.out.println("El combustible de esta nave se ha terminado, la cantidad es de "+fuel+ " toneladas");
        System.out.println("Hemor perdido completa señal el día 21 de Diciembre del año 1967");
    }
}

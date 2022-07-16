package abstracciones;

public abstract class Nave {
    public float length;
    public float fuel;
    public float thrust;
    public float totalWeight;
    public int time;

    public Nave(float length, float thrust, float totalWeight) {
        this.length = length;
        this.fuel = 0;
        this.thrust = thrust;
        this.totalWeight = totalWeight;
        this.time = 0;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "length=" + length +
                ", fuel=" + fuel +
                ", thrust=" + thrust +
                ", totalWeight=" + totalWeight +
                ", time=" + time +
                '}';
    }

    public Nave() {

    }

    public abstract void tanquear();
    public abstract void takeOff();
    public  void timeStart(){
        this.time = 0;
    };
}

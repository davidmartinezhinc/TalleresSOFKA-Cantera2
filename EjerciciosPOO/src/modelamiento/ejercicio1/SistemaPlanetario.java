package modelamiento.ejercicio1;

import java.util.Objects;

public class SistemaPlanetario {
    private  Integer id;
    private final NombrePlaneta nombrePLaneta;



    private double masa;
    public double masa2;
    private double densidad;
    private double diametro;
    private double distanciaSol;
    private double radio;
    private double radio2;
    private double radioMedio;
    private double radioMedioalCuadrado;
    public int id2;
    public double FuerzaGravitatoria;
    public final double GravitacionUniversal;



    public SistemaPlanetario(NombrePlaneta nombrePLaneta, Integer id, double masa, double densidad, double diametro, double distanciaSol) {
        this.nombrePLaneta = Objects.requireNonNull(nombrePLaneta);
        this.id = Objects.requireNonNull(id);
        this.masa = Objects.requireNonNull(masa);
        this.densidad = densidad;
        this.diametro = Objects.requireNonNull(diametro);
        this.distanciaSol = distanciaSol;
        radio = this.diametro / 2;
        GravitacionUniversal = 0.00000000667;
        if (masa <= 0) {
            throw new IllegalArgumentException(" No se puede tener una masa negativa o en cero ");
        }
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }
    public enum NombrePlaneta {
        MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
    }

    public Integer getId() {
        switch (id)
        {

            case 1 : id=1;
                masa2 = getMasa();
                radio2 = getRadio();
                System.out.println("Mercurio");
                break;
            case 2 : id=2;
                masa2 = getMasa();
                radio2 = getRadio();
                System.out.println("Venus");
                break;
            case 3 : id=3;
                masa2 = getMasa();
                radio2 = getRadio();
                System.out.println("Tierra");
                break;
            case 4 : id=4;
                masa2 = getMasa();
                radio2 = getRadio();
                System.out.println("Marte");
                break;
            case 5 : id=5;
                System.out.println("Jupiter");
                break;
            case 6 : id=6;
                System.out.println("Saturno");
                break;
            case 7 : id=7;
                System.out.println("Urano");
                break;
            case 8 : id=8;
                System.out.println("Neptuno");
                break;
        }
        return id;
    }

    public double obtenerAtraccionGravitatoria() {
        radioMedio = radio + radio2;
        radioMedioalCuadrado = Math.pow(radioMedio, 2);
         id2 = getId() + 1;
        for ( id=1;id < 9; id++){
            masa = getMasa();
            for ( id2=1; id2 < 9; id2++) {
                if (id != id2) {

                    FuerzaGravitatoria = (GravitacionUniversal * masa * masa2) / radioMedioalCuadrado;

                }

            }
        }
        System.out.println(masa);
        System.out.println(masa2);
        System.out.println(radio);
        System.out.println(radio2);
        System.out.println(radioMedio);
        System.out.println(radioMedioalCuadrado);
        System.out.println(id);
        System.out.println(id2);
        System.out.println(GravitacionUniversal);
        System.out.println("La fuerza de atracción gravitacional es "+FuerzaGravitatoria);
        return FuerzaGravitatoria;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public Integer getId2() {
        this.id = this.id + 1;
        return this.id;
    }

    @Override
    public String toString() {
        return "SistemaPlanetario{" +
                "id=" + id +
                ", nombrePLaneta=" + nombrePLaneta +
                ", masa=" + masa +
                ", masa2=" + masa2 +
                ", densidad=" + densidad +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", radio=" + radio +
                ", radio2=" + radio2 +
                ", radioMedio=" + radioMedio +
                ", radioMedioalCuadrado=" + radioMedioalCuadrado +
                ", id2=" + id2 +
                ", FuerzaGravitatoria=" + FuerzaGravitatoria +
                ", GravitacionUniversal=" + GravitacionUniversal +
                '}';
    }
    /*public double obtenerAtraccionGravitatoria() {
        for (id = 1;id < 9; id++) {
            this.setGetMasa(masa);
            double aux;

            int radio = diametro % 2;
            aux = (int) (masa * masa2*);
            double radio1 = Math.pow(masa,2);
            atraccionGravitatoria = aux / radio1;

        }
        System.out.println("La fuerza de atracción gravitacional es: "+ atraccionGravitatoria);
        return this.F(id);
    }*/

}

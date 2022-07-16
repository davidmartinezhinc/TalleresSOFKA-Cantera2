package sofka.clase.fruta;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFruit {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("manzana",255);
        Fruit fruit1 = new Fruit("pera",255);
        Fruit fruit2 = new Fruit("mandarina",255);
       // ArrayList<String> colors = new ArrayList<>();

        fruit.addColor("red");
        fruit.addColor("blue");
        fruit.addColor("yellow");
        fruit1.addColor("reddark");
        fruit1.addColor("bluesky");
        fruit1.addColor("yellowdark");
        fruit2.addColor("red");
        fruit2.addColor("blue");
        fruit2.addColor("yellow");
      /*  colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        fruit.setColors(colors);
        fruit1.setColors(colors);
        fruit2.setColors(colors);*/



        System.out.println(fruit);
        System.out.println(fruit1);
        System.out.println(fruit2);
        String nombre = fruit.getName();
        System.out.println(nombre);


        System.out.println(fruit1.getColors());

    }
}

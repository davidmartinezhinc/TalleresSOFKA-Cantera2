package sofka.clase.perro;
/**
 * Representa un perro, el cual realiza acciones  sencillas como dormir y despertarse
 *
 * @autor David Martinez Hincapié
 */
public class Dog {
        /**
         * Representa la raza de dicho perro
         */
        private String race;
        /**
         * Representa el nombre por el cual es identificado el perro
         */
        private String name;
        /**
         * Representa la edad en años humanos del perro
         */
        private int age;
        /**
         * Representa el estado del perro, si se encuentra dormido o despierto
         */
        private boolean status;

        /**
         * Es el constructor de esta clase con sus propiedades
         * @param race Primer atributo de la clase  Perro
         * @param name  Segundo atributo de la clase Perro
         * @param age Tercer atributo de la clase  Perro
         * @param status  Cuarto atributo de la clase  Perro
         */
        public Dog(String race, String name, int age, boolean status) {
            this.race = race;
            this.name = name;
            this.age = age;
            this.status = status;
        }

        /**
         * Es la función donde se muestra un mensaje diciendo si el perro se encuentra despierto
         */
        public void wakeUp(){
            this.status=true;
            System.out.println("The dog "+name+ " is awake");
        }
        /**
         * Es la función donde se muestra un mensaje diciendo si el perro se encuentra dormido
         */
        public void sleep(){
            this.status=false;
            System.out.println("The dog "+name+ " is asleep");
        }
        /**
         * Es la función donde se muestra un mensaje diciendo si el perro se encuentra despierto o
         * dormido y cambia su estado
         */
        public void statusDog(){
            if (this.status==true){
                System.out.println("The dog "+name+ " is awake");
            }else {
                System.out.println("The dog "+name+ " is asleep");
            }
        }
        /**
         * Es la función donde recibe la edad del perro en años humanos y devuelve la edad en años perro
         */
        public int convertAge(){
            int convert = this.age * 7;
            return convert;
        }
        /**
         * Retorna todos los valores de los atributos como String debidamente ordenados a la hora de imprimir
         * @return
         */
        @Override
        public String toString() {
            return "Dog{" +
                    "race='" + race + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", status=" + status +
                    '}';
        }
    /**
     * Acá se generaron los getters and setters de las 4 propiedades que tiene la clase Dog
     * @return
     */

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
}
